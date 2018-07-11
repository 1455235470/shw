package com.shu.shw.mapper;

import com.shu.shw.entity.Goods;
import com.shu.shw.entity.GoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {
    int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(String goid);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(String goid);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);


    /**
     * 查询所有包含关系
     * @return
     */
    List<Goods> selectGoodsCategoryShop();

    /**
     * 查询所有评论信息
     * @param goid
     * @return
     */
    public Goods selectGoodsAndComment(String goid);
}