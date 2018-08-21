package com.taotao.service;

import com.taotao.common.EasyUIDataGridResult;

/**
 * @description:
 * @author: Will.Guo
 * @create: 2018-08-18 23:19
 **/
public interface ItemService {

    public EasyUIDataGridResult getItemList(int page, int rows);
}
