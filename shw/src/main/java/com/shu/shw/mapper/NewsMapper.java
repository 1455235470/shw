package com.shu.shw.mapper;

import com.shu.shw.entity.News;
import com.shu.shw.entity.NewsExample;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    int countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(String neid);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExample(NewsExample example);

    News selectByPrimaryKey(String neid);

    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    /**
     * 查询所有资讯  和  所有关系
     * @return
     */
    List<News> selectNewsUserCategory();
}