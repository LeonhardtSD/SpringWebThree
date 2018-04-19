package com.gaozhaxi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Leon
 */
@Configuration
@EnableWebMvc
@ComponentScan("org.gaozhaoxi")
public class MyMVCConfig extends WebMvcConfigurerAdapter{
    
}
