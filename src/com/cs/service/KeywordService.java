package com.cs.service;

import com.cs.entity.Keyword;

import java.util.List;

public interface KeywordService  {

    //查询方法
    public List<Keyword> findKeywordInfoAll() throws Exception;

    //根据关键词查询方法
    public Keyword findInfoByKeyword(String name) throws Exception;

    //添加关键词方法
    public boolean addKeyword(Keyword keyword) throws Exception;

    //删除关键词方法
    public boolean delKeyword(int id) throws Exception;

}
