package com.acowzon.dao;

import com.acowzon.functino.DaoUtils;
import com.acowzon.pojo.Goods;
import com.acowzon.utils.MybatisUtils;
import com.acowzon.utils.OrderMehtod;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.apache.log4j.Logger;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class TestMybatis {

    @Test
    public void totalTest(){
        Goods goodsById = DaoUtils.getGoodsById(2);
        System.out.println(goodsById);

    }

    @Test
    public void testSelect(){
        List<Goods> goods = DaoUtils.getAllGoods();

        for (Goods good : goods) {
            System.out.println(good);
        }
    }

    @Test
    public void testSelectByType(){
        List<Goods> goods = DaoUtils.getGoodsByType("裤子");
        for (Goods good : goods) {
            System.out.println(good);
        }
    }

    @Test
    public void testSelectByMap(){
        HashMap<String, String> map = new HashMap<>();
        map.put("orderMethod", OrderMehtod.SOLDCOUNT);


        List<Goods> goods = DaoUtils.queryGoodsByMap(map);
        for (Goods good : goods) {
            System.out.println(good);
        }
    }

    @Test
    public void testAdd(){
        Goods goods = new Goods("牛仔裤", "裤子", 222, "", "这是一条牛仔裤", "牛仔裤的描述", 100, 1, 1, new Date(), new Date());
        DaoUtils.addGoods(goods);

    }

    @Test
    public void testViews(){
        DaoUtils.addViews(1);
    }

    @Test
    public void testStars(){
        DaoUtils.addStars(1);
    }

    @Test
    public void testSoldCount(){
        DaoUtils.addSoldCount(2, 3);
    }
}
