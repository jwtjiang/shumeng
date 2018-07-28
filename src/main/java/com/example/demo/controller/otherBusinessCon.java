package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.demo.Util.Constant;
/**u
 * Created by jwt on 2018/7/26.
 * 其它业务类
 */
@RestController
public class otherBusinessCon {

    @Resource
   // otherBusinessService otherbusinessservice;
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
            //List list = otherbusinessservice.riskList(params);
            //把成功标识和数据一起放到map中返回去
            map.put(Constant.con_success,Constant.con_success_value);
           // map.put(Constant.retValue,list);
        }catch (Exception e){
            e.printStackTrace();
            //异常也会给前端一个提示信息
            map.put(Constant.con_false,Constant.con_false_value);
            map.put(Constant.retValue,Constant.retValue_false);
        }
        return map;
    }

    /**
     * 删除风险评估列表信息
     * @param params
     * @return
     */
    @RequestMapping("/delectRiskList")
    public Map delectRiskList(@RequestParam("params") String params){
        Map map = new HashMap();
        try {
           // otherbusinessservice.delectRiskList(params);
            map.put(Constant.con_success,Constant.con_success_value);
        }catch (Exception e){
            e.printStackTrace();
            map.put(Constant.con_false,Constant.con_false_value);
            map.put(Constant.retValue,Constant.retValue_delect_false);
        }
        return map;
    }
    @RequestMapping("/login")
    @ResponseBody
    public Object login(@RequestParam("params")String params){
        System.out.println(params);
        return "";
    }
}
