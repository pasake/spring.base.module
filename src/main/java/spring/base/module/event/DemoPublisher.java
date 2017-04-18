package spring.base.module.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * Created on 2017/4/18.
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationEventPublisher context;

    public void publish(String msg) {
        context.publishEvent(new DemoEvent(this, msg));
    }
}
