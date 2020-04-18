package com.pactera.buqa.coe.zuul.filter;//package com.pactera.buqa.coe.zuul.filter;
//
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.exception.ZuulException;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//
//
//@Component
//@Slf4j
//public class ExceptionFilter extends ZuulFilter {
//    @Override
//    public String filterType() {
//        return "pre";
//    }
//
//    @Override
//    public int filterOrder() {
//        return 0;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run()  {
//        try{
//           log.info("测试异常");
//           throw new Exception("异常");
//        }catch (Exception e){
//            log.error(e.getMessage());
//        }
//        return null;
//    }
//}
