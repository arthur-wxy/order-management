package com.biyun.order.starter;

public class ApiResponse<T> {
    private boolean success;
    private T content;

    public ApiResponse(){}

    public ApiResponse(boolean success, T content) {
        this.success = success;
        this.content = content;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
