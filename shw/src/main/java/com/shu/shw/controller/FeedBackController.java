package com.shu.shw.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.shu.shw.entity.Feedback;
import com.shu.shw.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/feedback")
public class FeedBackController {


    @Autowired
    private FeedBackService feedBackService;


    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(@RequestParam(required = false , defaultValue = "1")Integer page ,
                          @RequestParam(required = false, defaultValue = "10")Integer rows){
        Page<Feedback> byPage = feedBackService.findByPage(page, rows);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("rows", byPage);
        jsonObject.put("total", feedBackService.countFeedBack());
        String s = JSONObject.toJSONStringWithDateFormat(jsonObject, "yyyy-MM-dd");
        return s;
    }


    @RequestMapping({"/feedback.htm", "/feedback"})
    public String toFeedBack(){
        return "feedback/backlist";
    }

}
