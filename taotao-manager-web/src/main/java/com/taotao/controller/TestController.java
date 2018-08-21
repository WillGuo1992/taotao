package com.taotao.controller;

import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: Will.Guo
 * @create: 2018-08-15 23:36
 **/
@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test/testNow")
    @ResponseBody
    public String testNow() {
       return testService.selectNow();
    }
}
