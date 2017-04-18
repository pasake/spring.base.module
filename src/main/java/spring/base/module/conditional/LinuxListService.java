package spring.base.module.conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

/**
 * Created on 2017/4/18.
 */
@Service
@Conditional(LinuxCondition.class)
public class LinuxListService implements ListService {
    public String listCmd() {
        return "ls";
    }
}
