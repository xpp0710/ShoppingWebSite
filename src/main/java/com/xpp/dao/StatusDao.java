package com.xpp.dao;

import com.xpp.po.Status;

import java.util.List;

/**
 * @author XPP
 * @create 2019-11-21-14:39
 */
public interface StatusDao {

    //查询全部
    List<Status> selectAll();
    //根据ID查询
    Status selectId(int statusId);


}
