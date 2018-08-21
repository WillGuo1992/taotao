package com.taotao.controller;

import com.taotao.common.TaotaoResult;
import com.taotao.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @description:
 * @author: Will.Guo
 * @create: 2018-08-19 02:58
 **/
@Controller
@RequestMapping("/content")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @RequestMapping("/category/list")
    @ResponseBody
    public List getContentCategoryList(@RequestParam(value = "id",defaultValue = "0") Long parentId) {
        List list = contentService.getContentCategoryList(parentId);
        return list;
    }

    @RequestMapping("/category/update")
    @ResponseBody
    public List updateCategory(@RequestParam Long parentId,@RequestParam String name) {
//        return contentService.addContentCategory(parentId, name);
        return null;
    }

    @RequestMapping("/category/create")
    @ResponseBody
    public TaotaoResult createCategory(@RequestParam Long parentId, @RequestParam String name) {
        return contentService.addContentCategory(parentId, name);
    }
}
