package com.example.demo.controller;

import com.example.demo.Util.jsonTranUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by jwt on 2018/7/25.
 * 导出csv文件类
 */
@RestController
public class exportCsvCon {
    @Resource

    @RequestMapping("/hello")
    public String name (@RequestParam("id") int id){

        String o = "{'emName':'home'}";
        Map<String, Object> itemMap = jsonTranUtil.JsonToMap(o);
        System.out.println(itemMap.get("pagetype"));
        return "";
    }
}
