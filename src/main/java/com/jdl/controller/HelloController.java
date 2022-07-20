package com.jdl.controller;


import com.jdl.util.ResultData;
import com.jdl.vo.AuthorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private AuthorVo authorVo;

    @RequestMapping("/getResources")
    public ResultData getResources(){
        return ResultData.success(200,"请求成功",authorVo);
    }

    @RequestMapping("/getFreemarker")
    public String getFreemarker(){
        return "index";
    }


}
