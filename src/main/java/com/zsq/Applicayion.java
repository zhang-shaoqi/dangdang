package com.zsq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  springboot入口类
 *
 *      注解：@SpringBootApplication
 *          1.自动创建spring + springMVC 开发环境
 *          2.可以和第三方插件做集成    如：redis、ES等
 *          3.自动扫描同包及子包下的所有注解
 *
 *      注解：@MapperScan("com.zsq.dao")
 *          1.自动创建com.zsq.dao包中的实现类对象
 */
@SpringBootApplication
@MapperScan("com.zsq.dao")
public class Applicayion {

    /**
     *  springboot的人口函数，可以用来启动springboot项目
     * @param args  参数
     */
    public static void main(String[] args) {
        SpringApplication.run(Applicayion.class,args);
    }

}
