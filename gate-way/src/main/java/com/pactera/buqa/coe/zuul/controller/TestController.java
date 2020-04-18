package com.pactera.buqa.coe.zuul.controller;

import com.pactera.buqa.coe.zuul.config.ZuulConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    ZuulConfig zuulConfig;


}
