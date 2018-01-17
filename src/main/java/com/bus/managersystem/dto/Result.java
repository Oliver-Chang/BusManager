package com.bus.managersystem.dto;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private boolean success;
    private T data;
    private String error;

    public Result() {
        super();
    }

    public Result(T data , boolean success) {
        super();
        this.data = data;
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
    @Override
    public String toString() {
        return "JsonResult [success=" + success + ", data=" + data + ", error=" + error + "]";
    }

}
