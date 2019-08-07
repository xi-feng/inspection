package com.qhit.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qhit.pojo.LayuiResult;
import com.qhit.pojo.Regulation;
import com.qhit.service.RegulationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
@Controller
public class RegulationController {
    @Resource
    RegulationService regulationService;
    @RequestMapping("regulation.html")
    public String a(){
        return "regulation";
    }
    @RequestMapping("regulation")
    @ResponseBody
    public LayuiResult<Regulation> ggg(int page, int limit){
        PageHelper.startPage(page,limit);
        LayuiResult<Regulation> result=new LayuiResult<>();
        List<Regulation> list=regulationService.getRegulationList();
        System.out.println(page+"   "+limit);
        PageInfo<Regulation> pageInfo = new PageInfo<>(list);
        result.setData(pageInfo.getList());
        System.out.println(pageInfo);
        result.setCount(21);
        return result;
    }
}
