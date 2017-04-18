package spring.base.module.aop;

import org.springframework.stereotype.Service;

/**
 * Created on 2017/4/16.
 */
@Service
public class DemoMethod {
    public void add() {
        System.out.println("here is method aop");
    }
}
