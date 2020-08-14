package com.demo.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 过滤器配置类
 * 添加 @Configuration 注解，将自定义 Filter 加⼊入过滤链
 */

/**
 * 测试方式：启动项目DemoApplication，访问： * http://localhost:8080/hello?name=CL后，查看控制台输出
 */
@Configuration
public class WebConfiguration {

    @Bean
    public FilterRegistrationBean testFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/*");//对所有的 URL 进⾏行行了了监控
        registration.setName("MyFilter");
        registration.setOrder(6);   //Order 值越⼩小优先级越⾼高
        return registration;
    }
    @Bean
    public FilterRegistrationBean test2FilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter2());
        registration.addUrlPatterns("/*");
        registration.setName("MyFilter2");
        registration.setOrder(11);
        return registration;
    }

}