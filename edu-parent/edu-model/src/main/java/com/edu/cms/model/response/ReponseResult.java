package com.edu.cms.model.response;


import lombok.ToString;

/**
 * Created by mrt on 2018/3/5.
 */
@ToString
public class ReponseResult  {
 
    //操作代码
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;
    private ReponseResult(boolean success, int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }


}
