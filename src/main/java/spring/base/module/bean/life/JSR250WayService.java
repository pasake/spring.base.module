package spring.base.module.bean.life;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created on 2017/4/17.
 */
public class JSR250WayService {

    @PostConstruct//bean调用构造方法之后执行
    public void init() {
        System.out.println("JSR250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数 JSR250WayService");
    }

    @PreDestroy//bean销毁之前执行
    public void destory() {
        System.out.println("JSR250-destory-method");
    }
}
