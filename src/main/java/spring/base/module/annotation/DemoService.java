package spring.base.module.annotation;

import org.springframework.stereotype.Service;

/**
 * Created on 2017/4/18.
 */
@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解中获取bean");
    }
}
