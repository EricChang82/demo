package com.demo.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 过滤器 ==实现 Filter 接口，实现其中的 doFilter() ⽅方法；
 * //http://localhost:8080/hello?name=CL
 */
public class MyFilter2 implements Filter {
    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub
    }

    @Override
    public void doFilter(ServletRequest srequest, ServletResponse sresponse, FilterChain filterChain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        HttpServletRequest request = (HttpServletRequest) srequest;
        System.out.println("this is MyFilter2,url :" + request.getRequestURI());
        filterChain.doFilter(srequest, sresponse);
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
    }
}