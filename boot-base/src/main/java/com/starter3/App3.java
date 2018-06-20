package com.starter3;

import com.starter1.DIConfiguration;
import com.starter1.NoService;
import com.starter1.YesService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DIConfiguration.class);
        YesService y1 = ctx.getBean(YesService.class);
        YesService y2 = ctx.getBean(YesService.class);
        System.out.println("eq,"+y1.equals(y2));
        System.out.println("==,"+(y1==y2));
        NoService n1 = ctx.getBean(NoService.class);
        NoService n2 = ctx.getBean(NoService.class);
        System.out.println("eq,"+n1.equals(n2));
        System.out.println("==,"+(n1==n2));

    }
}
