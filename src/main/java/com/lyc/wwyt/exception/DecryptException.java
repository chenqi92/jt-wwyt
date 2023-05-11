package com.lyc.wwyt.exception;

import com.lyc.wwyt.config.SystemCode;

/**
 * 类 DecryptException
 *
 * @author ChenQi
 * @date 2023/5/11
 */
public class DecryptException extends RuntimeException {

    public DecryptException() {
        super(SystemCode.DES_ERROR.getMsg());
    }

    public DecryptException(Throwable e) {
        super(e.getLocalizedMessage());
    }

    public DecryptException(String message) {
        super(message);
    }
}
