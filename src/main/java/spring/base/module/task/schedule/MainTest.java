package spring.base.module.task.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created on 2017/4/18.
 */
public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskScheduleConfig.class);
    }
}
