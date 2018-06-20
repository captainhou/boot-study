package com.starter2;

import com.starter1.DIConfiguration;
import com.starter1.NoService;
import com.starter1.YesService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DIConfiguration.class);
        YesService service = ctx.getBean(YesService.class);
        service.say();
    }
}
