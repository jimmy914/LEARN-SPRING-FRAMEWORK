package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.stream.StreamSupport;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext(com.in28minutes.learn_spring_framework.HelloWorldConfiguration.class);

        System.out.println(context.getBean("name"));

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("person2MethodCall"));

        System.out.println(context.getBean("person3Parameters"));

        System.out.println(context.getBean("address2"));

        System.out.println(context.getBean(Address.class));
        ;
        System.out.println(context.getBean("Person5Qualifier"));
        //bean에 뭐가 있는지 나열하는 것.
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
    }
}
