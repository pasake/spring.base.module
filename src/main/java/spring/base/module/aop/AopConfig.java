package spring.base.module.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created on 2017/4/16.
 */
@Configuration
@ComponentScan("com.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
