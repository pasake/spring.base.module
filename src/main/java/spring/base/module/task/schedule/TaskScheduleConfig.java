package spring.base.module.task.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created on 2017/4/18.
 */
@Configuration
@ComponentScan("com.task.schedule")
@EnableScheduling
public class TaskScheduleConfig {

}
