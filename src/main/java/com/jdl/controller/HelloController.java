package com.jdl.controller;


import com.jdl.util.ResultData;
import com.jdl.vo.AuthorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class HelloController {
    @Autowired
    private AuthorVo authorVo;

    @RequestMapping("/getResources")
    @ResponseBody
    public ResultData getResources(){
        return ResultData.success(200,"请求成功",authorVo);
    }

    @RequestMapping("/getFreemarker")
    public String getFreemarker(){
        return "index";
    }


    @RequestMapping("/getFreemarker2")
    public ModelAndView getFreemarker2(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }


}
