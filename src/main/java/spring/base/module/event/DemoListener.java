package spring.base.module.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created on 2017/4/17.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    public void onApplicationEvent(DemoEvent event) {
        System.out.println("Listener接收到了消息Publisher：" + event.getMsg());
    }
}


