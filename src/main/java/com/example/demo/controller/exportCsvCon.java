package com.example.demo.controller;

import com.example.demo.util.jsonTranUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.exportCsvService;

import javax.annotation.Resource;
import java.util.Map;

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

        String o = "{'area':{'area':'1','pagetype':'home'},'pagetype':'home'}";
        Map<String, Object> itemMap = jsonTranUtil.JsonToMap(o);
        System.out.println(itemMap.get("pagetyupe"));
        return exportcsvservice.name(id);
    }
}
