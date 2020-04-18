package com.nwx.exception;

import com.nwx.common.ResultCodeEnum;
import lombok.Data;

/**
 * @description:
 * @author: nieweixing
 * @create: 2020-04-18 17:07
 **/
@Data
public class CMSException extends RuntimeException{

    private Integer code;

    public CMSException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public CMSException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "CMSException{" + "code=" + code + ", message=" + this.getMessage() + '}';
    }
}
