package spring.base.module.aop;

import java.lang.annotation.*;

/**
 * Created on 2017/4/16.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
