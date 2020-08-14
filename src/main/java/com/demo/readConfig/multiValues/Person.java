package com.demo.readConfig.multiValues;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 读取文件：默认配置文件
 * 读取属性：person前缀的属性
 */
@Component
@ConfigurationProperties(prefix="person")  //prefix 必须为小写
@Setter@Getter@ToString
public class Person {
    private String name;
    private String age;
}

