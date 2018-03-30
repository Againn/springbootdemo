package com.confuguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 项目启动入口，配置包的根路径
 */
@SpringBootApplication
@ComponentScan(basePackages = "com")
public class Entry {
    public static void main(String[] args) {
        SpringApplication.run(Entry.class,args);
    }
}
