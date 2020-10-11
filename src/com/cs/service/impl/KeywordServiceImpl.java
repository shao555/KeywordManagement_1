package com.cs.service.impl;

import com.cs.dao.impl.KeywordDaoImpl;
import com.cs.entity.Keyword;
import com.cs.service.KeywordService;

import java.util.List;

public class KeywordServiceImpl implements KeywordService {

    KeywordDaoImpl kdi = new KeywordDaoImpl();

    //查询方法
    @Override
    public List<Keyword> findKeywordInfoAll() throws Exception {
        return kdi.findKeywordInfoAll();
//        return null;
    }

    //根据关键词查询方法
    @Override
    public Keyword findInfoByKeyword(String name) throws Exception {
        return kdi.findInfoByKeyword(name);
//        return null;
    }

    //添加关键词方法
    @Override
    public boolean addKeyword(Keyword keyword) throws Exception {
        int i = kdi.addKeyword(keyword);
        if (i > 0) {
            return true;
        } else {
            return false;
        }
//        return 0;
    }

    //删除关键词方法
    @Override
    public boolean delKeyword(int id) throws Exception {
        int i = kdi.delKeyword(id);
        if (i > 0) {
            return true;
        } else {
            return false;
        }
//        return 0;
    }
}
