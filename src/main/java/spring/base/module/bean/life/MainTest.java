package spring.base.module.bean.life;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created on 2017/4/17.
 */
public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        BeanWayService beanWayService = context.getBean(BeanWayService.class);

        JSR250WayService service = context.getBean(JSR250WayService.class);

        context.close();
    }
}
