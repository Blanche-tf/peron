package com.tf.controller;

import com.tf.entity.Person_info;
import com.tf.service.Area_infoService;
import com.tf.service.Person_infoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("person_Info")
public class Person_infoController {
    @Resource
    Area_infoService area_infoService;
    @Resource
    Person_infoService person_infoService;

    // 显示
    @RequestMapping("findAll")
    public String finAll(Model model){
        model.addAttribute("person_info",person_infoService.findAll());
        return "show";
    }
    // 根据编号查询
    @RequestMapping("findById")
    public String findByid(Model model,Integer person_id){
        model.addAttribute("person_info",person_infoService.findById(person_id));
        model.addAttribute("area_info",area_infoService.findAll());
        return "upd";
    }
    // 修改
    @RequestMapping("upd")
    public String upd(Person_info person_info){
        person_infoService.doUpd(person_info);
        return "redirect:findAll";
    }
    // 添加显示
    @RequestMapping("addShow")
    public String addShow(Model model){
        model.addAttribute("area_info",area_infoService.findAll());
        return "add";
    }
    // 添加提交
    @RequestMapping("add")
    public String add(Person_info person_info){
        person_infoService.doAdd(person_info);
        return "redirect:findAll";
    }
}