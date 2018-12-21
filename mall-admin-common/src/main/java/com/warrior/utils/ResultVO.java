package com.warrior.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.HashMap;
import java.util.Map;

public class ResultVO extends HashMap<String,Object>{

    public ResultVO(){
        put("code",200);
    }
    public static Object getResultOk()  {
        ResultVO vo = new ResultVO();
        return vo;
    }
    public static JSONObject putMap(Map<String, Object> map){
        ResultVO vo =new ResultVO();
        vo.putAll(map);
        return JSONObject.parseObject(JSON.toJSONString(vo, SerializerFeature.PrettyFormat,
                SerializerFeature.WriteMapNullValue));
    }

    public static JSONObject getResultOk(String msg)  {
        ResultVO vo = new ResultVO();
        vo.put("errmsg",msg);
        return JSONObject.parseObject(JSON.toJSONString(vo, SerializerFeature.PrettyFormat,
                SerializerFeature.WriteMapNullValue));
    }

    public static JSONObject getResultError(int code,Object msg)  {
        ResultVO vo = new ResultVO();
        vo.put("code",code);
        vo.put("errmsg",msg);
        return JSONObject.parseObject(JSON.toJSONString(vo, SerializerFeature.PrettyFormat,
                SerializerFeature.WriteMapNullValue));
    }
    public static JSONObject getResultError(String msg)  {
        return getResultError(500,msg);
    }
    public static JSONObject getResultError()  {
        return getResultError(500,"未知异常，请联系管理员");
    }
    public Object put(String key, Object value) {
        super.put(key, value);
        return this;
    }
    public static String getResultOk2String(String type, Object object)  {
        ResultVO vo = new ResultVO();
        vo.put("code",200);
        vo.put("errmsg","success");
        vo.put("type",type);
        vo.put("data",object);
        return JSON.toJSON(vo).toString();
    }
}
