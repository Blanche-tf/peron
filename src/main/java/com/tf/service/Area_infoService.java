package com.tf.service;

import com.tf.dao.Area_infoDAO;
import com.tf.entity.Area_info;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Area_infoService {
    @Resource
    Area_infoDAO area_infoDAO;

    // 查询全部
    public List<Area_info> findAll(){
        return area_infoDAO.selectAll();
    }
}
