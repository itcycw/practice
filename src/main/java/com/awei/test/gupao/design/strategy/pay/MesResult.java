package com.awei.test.gupao.design.strategy.pay;

import java.util.Objects;

public class MesResult
{

    private  String code;
    private Object data;
    private  String  msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public MesResult(String code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MesResult{" +
                "code='" + code + '\'' +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
