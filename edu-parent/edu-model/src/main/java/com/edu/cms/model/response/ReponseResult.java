package com.edu.cms.model.response;


import lombok.ToString;

/**
 * 
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
