package com.simple.simplecore.domain;

/*
 * @Author     :
 * @Data       : 2022/6/24 20:45
 * @Description:
 */
public class Response {
    private int code;

    private String msg;

    private Object data;

    private static final String SUCCESS = "success";

    private static final String FAILED = "failed";

    public Response() {
    }

    private Response(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Response successful(Object object) {
        return new Response(1, SUCCESS, object);
    }

    public static Response failed(Object object) {
        return new Response(0, FAILED, object);
    }

    public static Response failed(String msg, Object object) {
        return new Response(0, msg, object);
    }

    public static Response failed(int code, String msg, Object object) {
        return new Response(code, msg, object);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
