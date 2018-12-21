package com.warrior.controller;


import com.warrior.utils.ResultVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/test")
    public Object test(){
        System.out.println("我执行了");
        //return "我来自:"+port;
        return ResultVO.getResultOk();
    }
}
