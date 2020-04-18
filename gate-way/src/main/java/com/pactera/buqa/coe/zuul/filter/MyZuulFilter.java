package com.pactera.buqa.coe.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.pactera.buqa.coe.zuul.config.ZuulConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@Slf4j
public class MyZuulFilter extends ZuulFilter {

    @Autowired
    ZuulConfig zuulConfig;
    /**
     * filterType：返回字符串，代表过滤器的类型。包含以下4种：
     * pre：请求在被路由之前执行
     * routing：在路由请求时调用
     * post：在routing和errror过滤器之后调用
     * error：处理请求时发生错误调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * filterOrder：通过返回的int值来定义过滤器的执行顺序，数字越小优先级越高。
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * shouldFilter：返回一个Boolean值，判断该过滤器是否需要执行。返回true执行，返回false不执行
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * run：过滤器的具体业务逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run()  {

        log.info("测试异常"+zuulConfig);
//        // 登录校验逻辑。
//        // 1）获取Zuul提供的请求上下文对象
//        RequestContext ctx = RequestContext.getCurrentContext();
//        // 2) 从上下文中获取request对象
//        HttpServletRequest req = ctx.getRequest();
//        // 3) 从请求中获取token
//        String token = req.getParameter("access-token");
//        // 4) 判断
//        if(token == null || "".equals(token.trim())){
//            // 没有token，登录校验失败，拦截
//            ctx.setSendZuulResponse(false);
//            // 返回401状态码。也可以考虑重定向到登录页。
//            ctx.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
//        }
        // 校验通过，可以考虑把用户信息放入上下文，继续向后执行
        return null;
    }
}
