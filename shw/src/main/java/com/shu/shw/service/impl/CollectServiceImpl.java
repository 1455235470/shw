package com.shu.shw.service.impl;

import com.shu.shw.entity.Collect;
import com.shu.shw.entity.CollectExample;
import com.shu.shw.mapper.CollectMapper;
import com.shu.shw.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service("collectService")
@Transactional
public class CollectServiceImpl implements CollectService {

    @Autowired
    private CollectMapper collectMapper;

    @Override
    public Collect addCollect(Collect collect) {

        try {
            collect.setScid(UUID.randomUUID().toString());
            collect.setSccreate(new Date());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("添加出错,请稍后重试");
        }
        return collect;

    }

    @Override
    public List<Collect> findByUser(String userid) {

        List<Collect> collects = null;
        try {
            collects = collectMapper.selectCollectGoodsShop(userid);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("查询出错,请稍后重试");
        }
        return collects;
    }

    @Override
    public void removeCollect(String coid) {

        try {
            collectMapper.deleteByPrimaryKey(coid);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("请稍后重试");
        }

    }
}
