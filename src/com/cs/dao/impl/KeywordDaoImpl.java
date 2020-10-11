package com.cs.dao.impl;

import com.cs.basedao.BaseDao;
import com.cs.dao.KeywordDao;
import com.cs.entity.Keyword;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class KeywordDaoImpl extends BaseDao implements KeywordDao {

    //查询方法
    @Override
    public List<Keyword> findKeywordInfoAll() throws Exception {
        List<Keyword> list =new ArrayList<>();
        String sql = "select * from keyword order by createdate desc";
        ResultSet rs = execQuery(sql, null);
        while (rs.next()) {
            Keyword keyword = new Keyword();
            keyword.setId(rs.getInt(1));
            keyword.setName(rs.getString(2));
            keyword.setType(rs.getString(3));
            keyword.setCreateDate(rs.getDate(4));
            list.add(keyword);
        }
        getClose();
        return list;
//        return null;
    }

    //根据关键词查询方法
    @Override
    public Keyword findInfoByKeyword(String name) throws Exception {
        Keyword keyword = null;
        String sql = "select * from keyword where name = ?";
        Object[] obj = {name};
        ResultSet rs = execQuery(sql, obj);
        while (rs.next()) {
            keyword = new Keyword();
            keyword.setId(rs.getInt(1));
            keyword.setName(rs.getString(2));
            keyword.setType(rs.getString(3));
            keyword.setCreateDate(rs.getDate(4));
        }
        getClose();
        return keyword;
//        return null;
    }

    //添加关键词方法
    @Override
    public int addKeyword(Keyword keyword) throws Exception {
        int index = -1;
        String sql = "INSERT INTO keyword(`name`,`type`,createDate)VALUE(?,?,?)";
        Object[] obj = {keyword.getName(),keyword.getType(),keyword.getCreateDate()};
        index = execUpdate(sql,obj);
        getClose();
        return index;
//        return 0;
    }

    //添加关键词方法
    @Override
    public int delKeyword(int id) throws Exception {
        int index = -1;
        String sql = "delete from keyword where id = ?";
        Object[] obj = {id};
        index = execUpdate(sql,obj);
        getClose();
        return index;
//        return 0;
    }
}
