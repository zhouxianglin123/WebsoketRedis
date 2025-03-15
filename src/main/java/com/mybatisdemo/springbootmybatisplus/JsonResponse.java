package com.mybatisdemo.springbootmybatisplus;

import lombok.Data;

@Data
public class JsonResponse {
    private int code;
    private String message;
    private Object data;

    public JsonResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static JsonResponse success(String message) {
        return new JsonResponse(200, message);
    }

    public static JsonResponse fail(String message) {
        return new JsonResponse(500, message);
    }
}
