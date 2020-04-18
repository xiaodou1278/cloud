package com.pactera.buqa.coe.zuul;

import com.pactera.buqa.coe.zuul.config.ZuulConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

@SpringCloudApplication
@EnableZuulProxy
public class GateWayApplication {
    @Autowired
    ZuulConfig zuulConfig;

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class);
    }
    // zuul配置能够使用config实现实时更新
//    @RefreshScope
//    @ConfigurationProperties("zuul")
//    public ZuulProperties zuulProperties() {
//        return new ZuulProperties();
//    }

}
