package com.tf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Person_info {
    @Id
    @Column
    private Integer person_id;      //	人员编号
    @Column
    private String  person_name;    //人员名称
    @Column
    private Integer person_area_id; //	户口所在地id
    @Column
    private Integer person_age; //	人员年龄
    @Column
    private String person_address;//	家庭地址

    public Person_info() {
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public Integer getPerson_area_id() {
        return person_area_id;
    }

    public void setPerson_area_id(Integer person_area_id) {
        this.person_area_id = person_area_id;
    }

    public Integer getPerson_age() {
        return person_age;
    }

    public void setPerson_age(Integer person_age) {
        this.person_age = person_age;
    }

    public String getPerson_address() {
        return person_address;
    }

    public void setPerson_address(String person_address) {
        this.person_address = person_address;
    }

    @Override
    public String toString() {
        return "Person_info{" +
                "person_id=" + person_id +
                ", person_name='" + person_name + '\'' +
                ", person_area_id=" + person_area_id +
                ", person_age=" + person_age +
                ", person_address='" + person_address + '\'' +
                '}';
    }
}