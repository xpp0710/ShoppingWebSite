package com.xpp.service;

import com.xpp.po.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author XPP
 * @create 2019-11-21-14:59
 */
public interface ProductService {
    //查询全部
    List<Product> selectAll(@Param("statusId") Integer statusId, @Param("productName") String productName);
    //根据Id查询
    Product selectone(@Param("productId") int productId);
    //新增
    int insert(Product pd);
    //删除
    int delete(int productId);
    //修改
    int update(Product pd);
}
