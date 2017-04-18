package spring.base.module.DI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created on 2017/4/16.
 */
public class UserServiceAction {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService service = context.getBean(UseFunctionService.class);

        System.out.println(service.sayHello());
        context.close();
    }
}
