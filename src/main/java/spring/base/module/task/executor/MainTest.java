package spring.base.module.task.executor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created on 2017/4/18.
 */
public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncTaskExecutor executor = context.getBean(AsyncTaskExecutor.class);

        for (int i = 0; i < 10; i++) {
            executor.executorTask(i);
            executor.executorTaskPlus(i);
        }

        context.close();
    }
}
