package com.gbq.config;

import com.gbq.util.GbqBeanDefinitionRegistrar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.gbq")
@Import(GbqBeanDefinitionRegistrar.class)
public class AppConfig {
}
