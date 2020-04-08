package com.example.automatic;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.example.automatic.mapper")
@SpringBootApplication
@EnableSwagger2Doc
public class AutomaticApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutomaticApplication.class, args);
    }

}
