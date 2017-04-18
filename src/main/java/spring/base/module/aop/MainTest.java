package spring.base.module.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created on 2017/4/16.
 */
public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotation annotation = context.getBean(DemoAnnotation.class);
        DemoMethod method = context.getBean(DemoMethod.class);

        annotation.add();
        method.add();
        context.close();
    }
}
