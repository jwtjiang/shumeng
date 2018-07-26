package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.otherBusinessService;
import javax.annotation.Resource;

/**
 * Created by jwt on 2018/7/26.
 * 其它业务类
 */
@RestController
public class otherBusinessCon {

    @Resource
    otherBusinessService otherbusinessservice;
    /**
     * @auther jwt
     * @ date 2018.7.26 10.28
     * @ param params (json的查询条件)
     * @ return Object
     */
    @RequestMapping("/riskList")
    public Object riskList(@RequestParam("params") String params){
        return "";
    }
}
