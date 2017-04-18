package spring.base.module.task.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created on 2017/4/18.
 */
@Service
public class ScheduleTaskService {
    private SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedDelay = 5000)
    public void reportCurTime() {
        System.out.println("current time is : " + format.format(new Date()) + " show console every five second");
    }

    //cron对应的参数   秒 分钟 小时 日 月 星期
    @Scheduled(cron = "0 * * * * *")//意思是每分钟的0秒调一次该任务
    public void fixTimeExe() {
        System.out.println("at the fixed time to show current time : " + format.format(new Date()));
    }
}
