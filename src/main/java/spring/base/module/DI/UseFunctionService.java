package spring.base.module.DI;


/**
 * Created on 2017/4/16.
 */
public class UseFunctionService {
    FunctionService service;

    public void setService(FunctionService service) {
        this.service = service;
    }

    public String sayHello() {
        return service.sayHello("World");
    }
}
