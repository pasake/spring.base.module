package spring.base.module.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created on 2017/4/18.
 */
public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ListService service = context.getBean(ListService.class);
        System.out.println(service.listCmd());
    }
}
