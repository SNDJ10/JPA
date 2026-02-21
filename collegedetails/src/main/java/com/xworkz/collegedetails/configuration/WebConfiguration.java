package com.xworkz.collegedetails.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.collegedetails")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("this is configuration");
    }
    public ViewResolver viewResolver(){
        return new InternalResourceViewResolver("/",".jsp");
    }
}
