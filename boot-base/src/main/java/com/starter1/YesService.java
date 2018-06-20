package com.starter1;

import com.starter2.AopPoint;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class YesService {

    @AopPoint("say yes")
    public void say() {
        System.out.println("yes");
    }
}
