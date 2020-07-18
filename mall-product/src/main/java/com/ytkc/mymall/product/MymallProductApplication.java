package com.ytkc.mymall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合mybatis-plus
 *    1）、导入依赖
 *        <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *    2）、配置
 *       1、配置数据源
 *         1）、导入数据库驱动
 *         2）、在application.yml中配置数据源
 *       2、配置Mybatis-plus
 *         1)、使用@MapperScan扫描dao
 *         2)、
 */
@MapperScan("com.ytkc.mymall.product.dao")
@SpringBootApplication
public class MymallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(MymallProductApplication.class, args);
    }
}
