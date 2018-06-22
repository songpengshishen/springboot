package com.wsp.controller;

import com.wsp.config.MyTestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring mvc 控制器
 */
@RestController
public class HelloController {



    @Autowired
    MyTestConfigBean myTestConfigBean;

    @RequestMapping("/")
    public String index(){
        return myTestConfigBean.getName() + "\t" + myTestConfigBean.getTitle() + "\t" + myTestConfigBean.getUuid();
    }
}
