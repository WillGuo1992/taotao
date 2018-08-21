package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: Will.Guo
 * @create: 2018-08-16 00:23
 **/
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex() {
        return "admin-index";
    }

    @RequestMapping("/index")
    public String showAdminIndex() {
        return "admin-index";
    }

    @RequestMapping("/{page}")
    public String showItemList(@PathVariable String page){
        return page;
    }
}
