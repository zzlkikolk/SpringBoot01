package com.test.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//把自定的Spring配置文件加载进来
@ImportResource(locations ={"classpath:bean.xml"})
@SpringBootApplication
public class Springboot1ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot1ConfigApplication.class, args);
    }

}
