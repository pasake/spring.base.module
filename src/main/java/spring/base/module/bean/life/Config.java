package spring.base.module.bean.life;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 2017/4/17.
 */
@Configuration
@ComponentScan("spring.base.module.bean.life")
public class Config {

    @Bean(initMethod = "init", destroyMethod = "destory")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
