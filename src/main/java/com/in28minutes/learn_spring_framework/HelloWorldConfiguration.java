package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//record를 사용하면 게터 세터 메소드 설정해줄 필요 없음
record Person (String name, int age, Address address) {

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
        return new Person("Ravi",20,new Address("광안리","busan"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(),age(),address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name,age,address3);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("gurogu","seoul");
    }

    @Bean(name = "address3")
    public Address address3() {
        return new Address("천안","충청도");
    }
}
