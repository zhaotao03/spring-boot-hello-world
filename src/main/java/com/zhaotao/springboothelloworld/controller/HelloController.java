package com.zhaotao.springboothelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaotao
 * @create 2020-04-09 12:10
 */

@RestController
public class HelloController {

    @RequestMapping("zhaotao")
    public String hello(){
        return "hello world of spring-boot from TenCentCloud!";
    }
}
