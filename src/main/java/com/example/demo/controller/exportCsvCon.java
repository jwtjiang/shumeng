package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.exportCsvService;

import javax.annotation.Resource;

/**
 * Created by jwt on 2018/7/25.
 * 导出csv文件类
 */
@RestController
public class exportCsvCon {
    @Resource
    exportCsvService exportcsvservice;
    @RequestMapping("/hello")
    public String name (@RequestParam("id") int id){
        System.out.println(id);
        return exportcsvservice.name(id);
    }
}
