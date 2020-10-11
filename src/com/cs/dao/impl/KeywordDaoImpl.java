package com.cs.dao.impl;

import com.cs.basedao.BaseDao;
import com.cs.dao.KeywordDao;
import com.cs.entity.Keyword;

import java.util.List;

public class KeywordDaoImpl extends BaseDao implements KeywordDao {
    @Override
    public List<Keyword> findKeywordInfoAll() throws Exception {

//        return null;
    }

    @Override
    public Keyword findInfoByKeyword(String name) throws Exception {
        return null;
    }

    @Override
    public int addKeyword(Keyword keyword) throws Exception {
        return 0;
    }

    @Override
    public int delKeyword(String name) throws Exception {
        return 0;
    }
}
