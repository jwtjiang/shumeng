package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.otherBusinessService;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.demo.Util.Constant;
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
        Map map = new HashMap();
        try {
            //获取列表集合
            List list = otherbusinessservice.riskList(params);
            //把成功标识和数据一起放到map中返回去
            map.put(Constant.con_success,Constant.con_success_value);
            map.put(Constant.retValue,list);
        }catch (Exception e){
            e.printStackTrace();
            //异常也会给前端一个提示信息
            map.put(Constant.con_false,Constant.con_false_value);
            map.put(Constant.retValue,Constant.retValue_false);
        }
        return map;
    }
}
