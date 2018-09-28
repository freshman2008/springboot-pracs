package com.highsky.springbootmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringbootMybatisApplication {

    @Autowired
    DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

    /**
     * 查看用了什么数据库连接池
     */
    public void run(String... args) throws Exception {
        System.out.println("DATASOURCE = " + dataSource);
    }
}
