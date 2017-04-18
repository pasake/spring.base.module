package spring.base.module.conditional;

import org.springframework.stereotype.Service;

/**
 * Created on 2017/4/18.
 */
@Service
public class WindowListService implements ListService {
    public String listCmd() {
        return "dir";
    }
}
