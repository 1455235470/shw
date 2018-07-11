package com.shu.shw.mapper;

import com.shu.shw.entity.NewsComment;
import com.shu.shw.entity.NewsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsCommentMapper {
    int countByExample(NewsCommentExample example);

    int deleteByExample(NewsCommentExample example);

    int deleteByPrimaryKey(String ncoid);

    int insert(NewsComment record);

    int insertSelective(NewsComment record);

    List<NewsComment> selectByExample(NewsCommentExample example);

    NewsComment selectByPrimaryKey(String ncoid);

    int updateByExampleSelective(@Param("record") NewsComment record, @Param("example") NewsCommentExample example);

    int updateByExample(@Param("record") NewsComment record, @Param("example") NewsCommentExample example);

    int updateByPrimaryKeySelective(NewsComment record);

    int updateByPrimaryKey(NewsComment record);

    /**
     * 查询用户评论的时候附带资讯
     * @param userid
     * @return
     */
    List<NewsComment> selectCommentNews(String userid);

    /**
     * 查询资讯评论的时候查询评论用户
     * @param newsid
     * @return
     */
    List<NewsComment> selectNewsCommentUser(String newsid);
}