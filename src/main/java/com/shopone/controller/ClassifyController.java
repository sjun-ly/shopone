package com.shopone.controller;


import com.shopone.entity.Classify;
import com.shopone.mapper.ClassifyMapper;
import com.shopone.service.ClassifyService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ly
 * @since 2020-11-06
 */
@Controller
@RequestMapping("classify")
public class ClassifyController {

    @Autowired
    ClassifyService classifyService;

    @RequestMapping("/get")
    public String getClassifyList(Model model) {
        System.out.println("123");
//        List<Classify> classifies = classifyMapper.selectList(null);
//        System.out.println(classifies);
//        model.addAttribute("classifies",classifies);
        List<Classify> classifyList =classifyService.getClassifyList();
        System.out.println(classifyList);

        return "index";
    }

}

