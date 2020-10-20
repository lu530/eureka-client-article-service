package com.springcloud.eureka.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("callHello")
    @ResponseBody
    public String callHello(){
        return restTemplate.getForObject("http://172.28.51.80:8081/user/hello", String.class);
    }

    @GetMapping("callHello2")
    @ResponseBody
    public String callHello2(){
        return restTemplate.getForObject("http://eureka-client-user-service/user/hello", String.class);
    }








}
