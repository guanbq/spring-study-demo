package com.gbq.config;

import com.gbq.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration // 此注解相当于之前的“beans.xml"文件
@Import(AppConfig2.class) // 此注解相当于之前的XML文件的import标签
@ComponentScan("com.gbq")  // 此注解相当于XML的注解扫描包
public class AppConfig {

    @Bean // 此注解相当于XML中的bean标签
    public User getUser(){
        return new User();
    }
}
