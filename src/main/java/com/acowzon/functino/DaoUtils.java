package com.acowzon.functino;

import com.acowzon.dao.GoodsMapper;
import com.acowzon.pojo.Goods;
import com.acowzon.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class DaoUtils {
    static Logger logger = Logger.getLogger(DaoUtils.class);

    // 查询所有的商品
    public static List<Goods> getAllGoods(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        try{
            GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
            List<Goods> allGoods = mapper.getAllGoods();
            return allGoods;
        } catch (Exception e){
            logger.error(e.getMessage());
            return null;
        } finally {
            sqlSession.close();
        }
    }

    // 根据类别查询所有的商品
    public static List<Goods> getGoodsByType(String type){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        try{
            GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
            List<Goods> allGoods = mapper.getGoodsByType(type);
            return allGoods;
        } catch (Exception e){
            logger.error(e.getMessage());
            return null;
        } finally {
            sqlSession.close();
        }
    }

    // 根据条件map来查询所有的商品
    public static List<Goods> queryGoodsByMap(Map map){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        try{
            GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
            List<Goods> goods = mapper.queryGoodsByMap(map);
            return goods;
        } catch (Exception e){
            logger.error(e.getMessage());
            return null;
        } finally {
            sqlSession.close();
        }
    }

    //  根据id来查询一个商品
    public static Goods getGoodsById(int id){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        try{
            GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
            return mapper.getGoodsById(id);
        } catch (Exception e){
            logger.error(e.getMessage());
            return null;
        } finally {
            sqlSession.close();
        }
    }


    // 添加一个商品
    public static void addGoods(Goods goods){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        try{
            GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
            mapper.addGoods(goods);
            sqlSession.commit();
        } catch (Exception e){
            logger.error(e.getMessage());
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }
    }

    // 浏览数增加
    public static void addViews(int id){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        try{
            GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
            mapper.addViews(id);
            sqlSession.commit();
        } catch (Exception e){
            logger.error(e.getMessage());
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }
    }

    // 喜爱数增加
    public static void addStars(int id){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        try{
            GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
            mapper.addStars(id);
            sqlSession.commit();
        } catch (Exception e){
            logger.error(e.getMessage());
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }
    }

    // 增加销售量
    public static void addSoldCount(int id, int count){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        try{
            GoodsMapper mapper = sqlSession.getMapper(GoodsMapper.class);
            mapper.addSoldCount(id, count);
            sqlSession.commit();
        } catch (Exception e){
            logger.error(e.getMessage());
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }
    }
}
