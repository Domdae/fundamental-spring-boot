package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {
    public static void main(String[] args) {
        // 1. Lunch a spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // 2. Configure things that we want Spring to manage - @Configuration class
        // HelloWorldConfiguration - @Configuration
        // name - @Bean (custom object)

        // 3.Retrieving Beans managed by Spring
        // anything that is managed by spring called bean
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address"));

    }
}
