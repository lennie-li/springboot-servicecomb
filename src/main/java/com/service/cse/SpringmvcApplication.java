package com.service.cse;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
@MapperScan("com.service.cse.mapper")
public class SpringmvcApplication {
    public static void main(String[] args) {
         SpringApplication.run(SpringmvcApplication.class,args);
    }
}
