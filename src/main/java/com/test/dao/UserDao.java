package com.test.dao;

import java.util.HashMap;
import java.util.Map;

import com.test.model.User;

public interface UserDao {

    User selectUser1(String username);
    
    
    void insertUser1(Map<String, Object> param);
//    {
//    	 //设置dbKey
//        DBContextHolder.setDBKey(0L);
//
//        Map<String, Object> param = new HashMap<>();
//        param.put("uid", uid);
//        param.put("upliveCode", upliveCode);
//        param.put("tableSuffix", getTableSuffix(upliveCode));
//        param.put("createTime", DateUtil.getTime());
//        this.getSqlSessionW().insert("upliveCode.insert", param);
//    }

}