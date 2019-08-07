package com.qhit.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qhit.mapper.RatiotableDao;
import com.qhit.pojo.LayuiResult;
import com.qhit.pojo.Ratiotable;
import com.qhit.pojo.Regulation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class RatiotableController {
    @Resource
    RatiotableDao ratiotableDao;


}
