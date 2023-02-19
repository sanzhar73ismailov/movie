package com.sanismail.movieweb;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sanismail.movieweb"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ,
                pattern = "com.sanismail.movieweb.dto.*"))

public class MoviewebApplication implements CommandLineRunner {

    @Autowired
    private ApplicationContext appContext;

    public static void main(String[] args) {
        SpringApplication.run(MoviewebApplication.class, args);
    }

    /**
     * to check the list of beans
     */
    @Override
    public void run(String... args) {
        String[] beans = appContext.getBeanDefinitionNames();
        System.out.println("beans.length 111 = " + beans.length);
        Arrays.sort(beans);
//        for (String bean : beans) {
//            System.out.println(bean);
//        }
    }

}
