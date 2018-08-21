package com.taotao.controller;

import org.apache.log4j.Level;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

/**
 * @description:
 * @author: Will.Guo
 * @create: 2018-08-20 22:51
 **/
public class GlobalExceptionReslover implements HandlerExceptionResolver {

    private Logger logger = (Logger) LoggerFactory.getLogger(GlobalExceptionReslover.class);
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "系统异常");
        modelAndView.setViewName("error/exception");
        return modelAndView;
    }


}
