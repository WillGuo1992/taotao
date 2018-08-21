package com.taotao.service;

import com.taotao.common.TaotaoResult;

import java.util.List;

/**
 * @description:
 * @author: Will.Guo
 * @create: 2018-08-19 02:33
 **/
public interface ContentService {
    public List getContentCategoryList(long parentId);

    public TaotaoResult addContentCategory(long parentId, String name);

}
