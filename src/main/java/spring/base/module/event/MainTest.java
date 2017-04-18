package spring.base.module.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created on 2017/4/18.
 */
public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        //publish消息给所有观察者
        context.getBean(DemoPublisher.class).publish("Hello Application Event");

        context.close();
    }
}
