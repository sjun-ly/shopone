package com.shopone.controller;


import com.shopone.mapper.GdDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ly
 * @since 2020-11-06
 */
@RestController
@RequestMapping("/shopone/gd-detail")
public class GdDetailController {
    @Autowired
    GdDetailMapper gdDetailMapper;

    @ResponseBody
    @RequestMapping("/infoGdDeatilByID")
    public  Object findGdDetail(){
        System.out.println(gdDetailMapper);
        System.out.println(1);
        return  gdDetailMapper.infoGdDeatilByID(1);

    }
}

