package com.tf.dao;

import com.tf.entity.Person_info;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;
@org.apache.ibatis.annotations.Mapper
public interface Person_infoDAO extends Mapper<Person_info> {
    @Select("SELECT p.*,a.area_name FROM person_info p inner join area_info a on p.person_area_id = a.area_id")
    List<Map<String,Object>> findAll();
}
