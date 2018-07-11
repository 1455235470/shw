package com.shu.shw.service;

import com.github.pagehelper.Page;
import com.shu.shw.entity.Feedback;

import java.util.List;

/**
 * FeedBack 反馈相关的操作
 */
public interface FeedBackService {

    /**
     * 添加反馈信息
     * @param feedback
     */
    public void addFeedBack(Feedback feedback);

    /**
     * 查询所有反馈信息
     * @return
     */
    public List<Feedback> findAll();

    /**
     * 分页查询
     * @param page
     * @param rows
     * @return
     */
    public Page<Feedback> findByPage(Integer page , Integer rows);

    /**
     * 统计个数
     * @return
     */
    public Integer countFeedBack();

}
