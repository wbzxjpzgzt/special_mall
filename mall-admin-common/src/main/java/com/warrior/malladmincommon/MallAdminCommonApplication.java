package com.warrior.malladmincommon;

import com.warrior.utils.ResultVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class MallAdminCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallAdminCommonApplication.class, args);
    }
    @Value("${server.port}")
    public String port;


    @RequestMapping("/hilo")
    public Object hilo(){
        return ResultVO.getResultOk("connect 8761 success");
    }

}

