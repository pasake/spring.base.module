package spring.base.module.aop;

import org.springframework.stereotype.Service;

/**
 * Created on 2017/4/16.
 */
@Service
public class DemoAnnotation {
    @Action(name = "注解式拦截add操作")
    public void add() {
        System.out.println("here is annotation aop");
    }
}
