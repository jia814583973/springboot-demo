package com.jdl.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ResultData {

    private int code;

    private String msg;

    private Object info;

    public static ResultData success(){
        return new ResultData(200,"请求成功");
    }

    public static ResultData success(int code,String msg){
        return new ResultData(code,msg);
    }

    public static ResultData success(int code,String msg,Object info){
        return new ResultData(code,msg,info);
    }

    public static ResultData error(){
        return new ResultData(501,"请求失败");
    }

    public static ResultData error(int code,String msg){
        return new ResultData(code,msg);
    }

    public static ResultData error(int code,String msg,Object info){
        return new ResultData(code,msg,info);
    }


    public ResultData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultData(int code, String msg, Object info) {
        this.code = code;
        this.msg = msg;
        this.info = info;
    }


    @Override
    public String toString() {
        return "ResultData{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", info=" + info +
                '}';
    }
}
