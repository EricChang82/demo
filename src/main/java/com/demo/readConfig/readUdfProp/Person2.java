package com.demo.readConfig.readUdfProp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 读取文件：自定义配置文件
 * 读取属性：person前缀的属性
 */
@Component
@PropertySource(value = "classpath:other.properties") //指定其他配置文件。
@ConfigurationProperties(prefix="otherperson")  //prefix 必须为小写
@Setter@Getter@ToString
public class Person2 {
    private String name;
    private String age;
}

