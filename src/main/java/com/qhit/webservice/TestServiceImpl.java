package com.qhit.webservice;

import javax.annotation.Resource;
import javax.jws.WebService;

import com.alibaba.fastjson.JSON;
import com.qhit.mapper.TbQingDao;
import com.qhit.pojo.*;
import com.qhit.service.*;
import com.qhit.util.Code_util;
import com.qhit.util.Uuid;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.qhit.util.Code_util.*;

/**
 * webservice测试接口实现
 * 
 * 
 * @author：WangYuanJun
 * @date：2017年12月19日 下午9:37:20
 */
@WebService(serviceName = "TestService", // 与接口中指定的name一致
targetNamespace = "http://service.wyj.com", // 与接口中的命名空间一致,一般是接口的包名倒
endpointInterface = "com.qhit.webservice.TestService"// 接口地址
)
@Component
public class TestServiceImpl implements TestService {

    Integer i=null;
    @Resource
    TbOrdersService tbOrdersService;
    @Resource
    TbWaybillService tbWaybillService;
    @Resource
    TbPayService tbPayService;
    @Resource
    TbQingService qingService;
    @Resource
    TbGoodsService tbGoodsService;
    @Resource
    TbOrdersdetailsService tbOrdersdetailsService;
    @Resource
    RegulationService regulationService;
    @Resource
    RatiotableService ratiotableService;
    @Override
    public String sendMessage(String code,String data) {
        if(code.equals(TbOrders_Code)){
           return StorageTbOrders(data);
        }else if (code.equals(TbWaybill_Code)){
           return StorageTbWaybill(data);
        }else if(code.equals(TbPay_Code)){
           return StorageTbPay(data);
        }else if(code.equals(TbQing_Code)){
           return StorageTbQing(data);
        }else if(code.equals(TbOrdersdetails_Code)){
            return  StorageTbOrdersdetails(data);
        }else if(code.equals(TbGoods_Code)){
            return  StorageTbGoods(data);
        }
            return "null";
    }
    //清单入库
    public String StorageTbQing(String data){
        Integer i=null;
        List<TbQing>  tbQings= JSON.parseArray(data, TbQing.class);
        //查询所有的校验规则
        List<Regulation> regulations=regulationService.getRegulationList();
        //查询校验比例
        Ratiotable ratio = ratiotableService.getRatio();
        for (TbQing tbQing:tbQings) {
            //查询出清单所对应的订单
            TbOrders tbOrders = tbOrdersService.getTbOrders(tbQing.getOrdersNo());
            //根据订单号查询订单明细
            List<TbOrdersdetails>  tbOrdersdetails = tbOrdersdetailsService.getTbOrdersdetails(tbQing.getOrdersNo());
            boolean falg=false;
            for (TbOrdersdetails ordersdetails:tbOrdersdetails) {
                for (Regulation regulation: regulations) {
                    //商品名字和负面清单维护的值作比较
                    if (ordersdetails.getGoodsName().contains(regulation.getSensitive())) {
                        //被负面清单规则命中
                        falg=true;
                        break;
                    }
                  }
                if(falg){
                    //被负面清单规则命中
                    break;
                }
         }
            if(falg){
                //更改负面清单，状态为2
                tbQing.setStauts("2");
            }else{
                //生成1-100随机数
                int suijishu= (int)(Math.random()*100+1);
                if (suijishu>ratio.getRatio()){
                    //需要人工审单,状态改为1
                    tbQing.setStauts("1");
                }else{
                    //自动放行,状态改为7
                    tbQing.setStauts("7");
                }


            }
            //入库
            i = qingService.addTbQings(tbQing);

        }
        return i==1?"清单入库成功":"清单入库失败";
    }

    //订单入库
    public String StorageTbOrders (String data){
        Integer i=null;
        //data转换化成对象
        List<TbOrders> tbOrders = JSON.parseArray(data, TbOrders.class);
        //入库
        for (TbOrders tbOrders1:tbOrders ) {
            i = tbOrdersService.addTbOrders(tbOrders1);
        }
        return  i==1?"订单入库成功":"订单入库失败";

    }
    //运单入库
    public String StorageTbWaybill(String data){
        Integer i=null;
        List<TbWaybill> tbWaybills = JSON.parseArray(data, TbWaybill.class);
        for (TbWaybill tbWaybill:tbWaybills) {
             i = tbWaybillService.addTbWaybills(tbWaybill);
        }
        return i==1?"运单入库成功":"运单入库失败";
    }
    //支付单入库
    public String StorageTbPay(String data){
        Integer i=null;
        List<TbPay>  tbPays= JSON.parseArray(data, TbPay.class);
        for (TbPay tbPay:tbPays) {
             i =tbPayService.addTbPays(tbPay);
        }
        return i==1?"支付单入库成功":"支付单入库失败";
    }

    /**
     * 商品备案tb_goods
     * @param data
     * @return
     */
    public String StorageTbGoods(String data){
        Integer i=null;
        List<TbGoods>  tbQings= JSON.parseArray(data, TbGoods.class);
        for (TbGoods tbGoods:tbQings) {
            i =tbGoodsService.addTbGoods(tbGoods);
        }
        return i==1?"商品备案成功":"商品备案失败";
    }

    /**
     * 订单明细
     * @param data
     * @return
     */
    public String StorageTbOrdersdetails(String data){
        Integer i=null;
        List<TbOrdersdetails>  ordersdetails= JSON.parseArray(data, TbOrdersdetails.class);
        for (TbOrdersdetails tbOrdersdetails:ordersdetails) {
             i =tbOrdersdetailsService.addTbOrdersdetails(tbOrdersdetails);
        }
        return i==1?"订单明细成功":"订单明细失败";
    }
}

