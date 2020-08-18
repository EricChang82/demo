package com.demo.controls.readConfig.multiValues;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 读取文件：默认配置文件
 * 读取属性：person前缀的属性
 */
@Component
@ConfigurationProperties(prefix="person")  //prefix 必须为小写
@Data  //相当于 @Setter@Getter@ToString
public class Person {
    private String name;
    private String age;
}

