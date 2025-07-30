package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//record를 사용하면 게터 세터 메소드 설정해줄 필요 없음
record Person (String name, int age) {

};

record Address(String firstLine, String city) {

};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
    return 15;
    }

    @Bean
    public Person person() {
        return new Person("Ranga",15);
    }

    @Bean
    public Address address() {
        return new Address("gurogu","seoul");
    }
}
