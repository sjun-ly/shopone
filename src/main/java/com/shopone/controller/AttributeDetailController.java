package com.shopone.controller;


import com.shopone.entity.AttributeDetail;
import com.shopone.service.AttributeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ly
 * @since 2020-11-06
 */
@RestController
@RequestMapping("/shopone/attribute-detail")
public class AttributeDetailController {
    @Autowired
    AttributeDetailService attributeDetailService;
    @RequestMapping("attributeDetails")
    public List<AttributeDetail> attributeDetails(){
        List<AttributeDetail> attributeDetails = attributeDetailService.attriButeByid();
        return attributeDetails;
    }

    @RequestMapping("/text")
    @ResponseBody
    public String txte(){
        return "668899";
    }

    @RequestMapping("/AllSerice")
    @ResponseBody
    public List<AttributeDetail> AllSerice(){
        List<AttributeDetail> attributeDetails = attributeDetailService.AllSerice();
        return attributeDetails;
    }

}

