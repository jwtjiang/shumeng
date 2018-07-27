package com.example.demo.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.poi.ss.formula.functions.T;

import java.util.Map;

/**
 * Created by admin on 2018/7/26.
 * json转化工具类
 */
public class jsonTranUtil {
    /**
     * json转化map
     * @param params
     * @return map
     */
    public static Map JsonToMap(String params){
        //fastjson引用阿里的把json转化成map
        Map<String, Object> itemMap = JSONObject.parseObject(params);
        return itemMap;
    }
}
