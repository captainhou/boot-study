package com.starter1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DIConfiguration.class);
        YesService service = ctx.getBean(YesService.class);
        service.say();
        NoService noService = ctx.getBean(NoService.class);
        noService.say();
    }
}
