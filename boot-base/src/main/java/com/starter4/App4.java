package com.starter4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig config = ctx.getBean(ElConfig.class);
        System.out.println(config.getBookName());
    }
}
