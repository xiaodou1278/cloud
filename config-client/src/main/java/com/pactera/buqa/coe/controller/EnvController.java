package com.pactera.buqa.coe.controller;

import com.pactera.buqa.coe.auto.AutoConfigData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class EnvController {
    @Value("${data.from}")
    private String from;
    @Autowired
    AutoConfigData autoConfigData;


    /*
     通过value 注解获取值
     */
    @RequestMapping(value = "/value/from")
    public String valueFrom(){
        return this.from;
    }

    @Autowired
    Environment env;
    /*
     通过value 注解获取值
     */
    @RequestMapping(value = "/env/from")
    public String envFrom(){
        return env.getProperty("data.from");
    }

    /*
     auto 注解获取值
     */
    @RequestMapping(value = "/auto/from")
    public String autoFrom(){
        return autoConfigData.getFrom();
    }
}
