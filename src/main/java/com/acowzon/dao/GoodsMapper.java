package com.acowzon.dao;

import com.acowzon.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface GoodsMapper {
    // 查询所有的商品
    List<Goods> getAllGoods();

    // 根据指定的类别来查找商品
    List<Goods> getGoodsByType(@Param("type") String type);

    // 根据条件来查询
    List<Goods> queryGoodsByMap(Map map);

    // 根据id查询一个商品
    Goods getGoodsById(@Param("id") int id);

    // 添加一个商品
    int addGoods(Goods goods);

    // 增加商品的浏览数,views+1,不需要更新修改时间
    void addViews(@Param("id") int id);

    // 增加商品的喜欢数,不需要更新修改时间
    void addStars(@Param("id") int id);

    // 增加商品的售出数量
    void addSoldCount(@Param("id") int id, @Param("count") int count);

    // 修改商品信息
    void updateGoods(@Param("id") int id, @Param("map")Map map, @Param("updateTime") Date date);
}
