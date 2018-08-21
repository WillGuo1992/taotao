package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.taotao.dao.TestNowMapper;
import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Will.Guo
 * @create: 2018-08-15 23:32
 **/
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestNowMapper mapper;

    @Override
    public String selectNow() {
        PageHelper pageHelper = new PageHelper();
        return mapper.selectNow();
    }
}
