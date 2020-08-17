package com.demo.log.log4jTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 测试基础模式日志输出到log4j
 * 测试方式：ControlMethodEntry 方法，访问 http://localhost:8080/testEntry，调用该类方法
 */
public class Log4jTest {
    private static final Logger logger = LoggerFactory.getLogger(Log4jTest.class);
    private static Log4jTest instance;
    public static Log4jTest getInstance() {
        instance = new Log4jTest();
        return instance;
    }
    public static void doTest(){
      getInstance().doLogTest();
    }
     public  void doLogTest(){
         logger.info("日志输出测试");
     }

}
