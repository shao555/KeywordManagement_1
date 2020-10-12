package com.cs.test;

import com.cs.entity.Keyword;
import com.cs.service.impl.KeywordServiceImpl;

import java.util.Date;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {

//        findAll();
//        findByName();

//        add();

        del();


    }

    private static void del() throws Exception {
        KeywordServiceImpl ksi = new KeywordServiceImpl();
        boolean b = ksi.delKeyword(8);
        if (b) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    private static void add() throws Exception {
        KeywordServiceImpl ksi = new KeywordServiceImpl();
        Keyword keyword = new Keyword();
        keyword.setName("欸嘿嘿");
        keyword.setType("哎呀");
        Date d=new Date(110,1,25);
        keyword.setCreateDate(d);
        boolean b = ksi.addKeyword(keyword);
        if (b) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    private static void findByName() throws Exception {
        KeywordServiceImpl ksi = new KeywordServiceImpl();
        Keyword k = ksi.findInfoByKeyword("战斗机");
        System.out.println(k.getId() + " " + k.getName() + " "
                + k.getType() + " " + k.getCreateDate());
    }


    private static void findAll() throws Exception {
        KeywordServiceImpl ksi = new KeywordServiceImpl();
        List<Keyword> list = ksi.findKeywordInfoAll();

        for (Keyword k : list) {
            System.out.println(k.getId() + " " + k.getName() + " "
            + k.getType() + " " + k.getCreateDate());
        }
    }
}


