package com.gao.vo;

public class ResultVO {

    public class Status {
        public static final int OK = 0;         // 正确
        public static final int P_ERROR = 1;    // 参数出错
        public static final int S_ERROR = 2;    // 业务出错
    }

    private int statusCode;
    private Object data;
    private String message;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
