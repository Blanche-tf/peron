package com.tf.service;

import com.tf.dao.Person_infoDAO;
import com.tf.entity.Person_info;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class Person_infoService {
    @Resource
    Person_infoDAO person_infoDAO;

    // 查询全部
    public List<Map<String,Object>> findAll(){
        return person_infoDAO.findAll();
    }
    // 根据id查询
    public Person_info findById(Integer person_id){
        return person_infoDAO.selectByPrimaryKey(person_id);
    }
    // 增
    public Integer doAdd(Person_info person_info){
        return person_infoDAO.insert(person_info);
    }
    // 修改
    public Integer doUpd(Person_info person_info){
        return person_infoDAO.updateByPrimaryKey(person_info);
    }
}
