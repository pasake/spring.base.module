package spring.base.module.task.executor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created on 2017/4/18.
 */
@Service
public class AsyncTaskExecutor {
    @Async
    public void executorTask(int i) {
        System.out.println("exe task " + i);
    }

    @Async
    public void executorTaskPlus(int i) {
        System.out.println("exe task +1 " + i++);
    }
}
