package com.ssii.foomap.common.core;

import javax.xml.ws.http.HTTPException;

/**
 * Name:GraceException
 * Description: 优雅的异常，程序里主动抛出的异常，这个异常信息将返回到客户端，客户端通过异常里的信息做相应动作
 * Author:leix
 * Time: 2017/7/7 15:58
 */
public class GraceException extends HTTPException {
    String message;

    public GraceException(int statusCode) {
        super(statusCode);
    }

    public GraceException(int statusCode, String msg) {
        super(statusCode);
        setMessage(msg);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
