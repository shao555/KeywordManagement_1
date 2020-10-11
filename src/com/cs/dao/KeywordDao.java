package com.cs.dao;

import com.cs.entity.Keyword;

import java.util.List;

public interface KeywordDao {

    //查询方法
    public List<Keyword> findKeywordInfoAll() throws Exception;

    //根据关键词查询方法
    public Keyword findInfoByKeyword(String name) throws Exception;

    //添加关键词方法
    public int addKeyword(Keyword keyword) throws Exception;

    //删除关键词方法
    public int delKeyword(String name) throws Exception;

}
