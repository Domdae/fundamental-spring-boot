package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) { };

record Address (String firstLine, String city) { };

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Fax";
    }

    @Bean
    public int age() {
        return 22;
    }

    @Bean
    public Person person() {
        return new Person("F2", 23, new Address("yo", "to"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), yo()); // name, age
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3); // name, age
    }

    @Bean (name = "address")
    public Address yo() {
        return new Address("Chang", "Chiang Mai");
    }

    @Bean (name = "address3")
    public Address address() {
        return new Address("Chang", "Chiang Mai2");
    }
}
