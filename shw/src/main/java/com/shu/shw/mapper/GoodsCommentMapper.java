package com.shu.shw.mapper;

import com.shu.shw.entity.Goods;
import com.shu.shw.entity.GoodsComment;
import com.shu.shw.entity.GoodsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsCommentMapper {
    int countByExample(GoodsCommentExample example);

    int deleteByExample(GoodsCommentExample example);

    int deleteByPrimaryKey(String gcoid);

    int insert(GoodsComment record);

    int insertSelective(GoodsComment record);

    List<GoodsComment> selectByExample(GoodsCommentExample example);

    GoodsComment selectByPrimaryKey(String gcoid);

    int updateByExampleSelective(@Param("record") GoodsComment record, @Param("example") GoodsCommentExample example);

    int updateByExample(@Param("record") GoodsComment record, @Param("example") GoodsCommentExample example);

    int updateByPrimaryKeySelective(GoodsComment record);

    int updateByPrimaryKey(GoodsComment record);

    /**
     * 查询一条评论的时候附带商品信息
     * @param userid
     * @return
     */
    List<GoodsComment> selectCommentGoods(String userid);

    /**
     * 查询商品的所有评论信息
     * @param goid
     * @return
     */
    List<GoodsComment> selectGoodsComment(String goodsid);



}