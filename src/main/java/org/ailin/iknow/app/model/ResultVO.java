package org.ailin.iknow.app.model;

import java.util.ArrayList;
import java.util.List;

public class ResultVO<T> {
    
    private boolean success; // 请求是否成功
    
    private String message;// 返回消息
    
    private List<T> result;// 返回结果

    public ResultVO(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
    
    public ResultVO(boolean success, String message, T result) {
        this.success = success;
        this.message = message;
        this.result = new ArrayList<>();
        this.result.add(result);
    }
    
    public ResultVO(boolean success, String message, List<T> result) {
        this.success = success;
        this.message = message;
        this.result = result;
    }
    
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
    
}
