package org.ailin.iknow.app.controller;

import java.util.List;

import org.ailin.iknow.app.common.consts.LabelConsts;
import org.ailin.iknow.app.model.ResultVO;

public class BaseController {
    
    public ResultVO<String> success(){
        return new ResultVO<String>(true, LabelConsts.SUCCESS_MESSAGE);
    }
    
    public ResultVO<String> success(String message){
        return new ResultVO<String>(true, message);
    }
    
    public <T> ResultVO<T> success(String message, T t){
        return new ResultVO<T>(true, message, t);
    }
    
    public <T> ResultVO<T> success(String message, List<T> t){
        return new ResultVO<T>(true, message, t);
    }
    
    public ResultVO<String> failure(){
        return new ResultVO<String>(false, LabelConsts.FAILURE_MESSAGE);
    }
    
    public ResultVO<String> failure(String message){
        return new ResultVO<String>(false, message);
    }
    
}
