package com.xpp.service;

import com.xpp.dao.ProductDao;
import com.xpp.po.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XPP
 * @create 2019-11-21-14:59
 */
@Service
public class ProductServiceimpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    public List<Product> selectAll(@Param("statusId") Integer statusId, @Param("productName") String productName) {
        return productDao.selectAll(statusId,productName);
    }

    public Product selectone(@Param("productId") int productId) {
        return productDao.selectone(productId);
    }

    public int insert(Product pd) {
        return productDao.insert(pd);
    }

    public int delete(int productId) {
        return productDao.delete(productId);
    }

    public int update(Product pd) {
        return productDao.update(pd);
    }
}
