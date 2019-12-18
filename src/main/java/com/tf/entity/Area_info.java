package com.tf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Area_info {
    @Id
    @Column
    private Integer area_id;            //  地区编号
    @Column
    private String area_name;        	//  地区名称

    public Area_info() {
    }

    public Integer getArea_id() {
        return area_id;
    }

    public void setArea_id(Integer area_id) {
        this.area_id = area_id;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    @Override
    public String toString() {
        return "Area_info{" +
                "area_id=" + area_id +
                ", area_name='" + area_name + '\'' +
                '}';
    }
}