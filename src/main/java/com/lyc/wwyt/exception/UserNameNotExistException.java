package com.lyc.wwyt.exception;

import com.lyc.wwyt.config.SystemCode;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 类 UserNameNotFoundException
 *
 * @author ChenQi
 * @date 2023/5/11
 */
public class UserNameNotExistException extends UsernameNotFoundException {

    public UserNameNotExistException() {
        super(SystemCode.USER_NOT_FOUND_ERROR.getMsg());
    }

    public UserNameNotExistException(String msg) {
        super(msg);
    }

    public UserNameNotExistException(String msg, Throwable t) {
        super(msg, t);
    }
}
