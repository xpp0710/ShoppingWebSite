package com.xpp.handler;

import com.xpp.po.Product;
import com.xpp.po.Status;
import com.xpp.service.ProductService;
import com.xpp.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @author XPP
 * @create 2019-11-21-15:16
 */
@Controller
@RequestMapping("/product")
public class ProductHandler {

    @Autowired
    private ProductService ps;
    @Autowired
    private StatusService ss;


    @RequestMapping("/select")
    public String selectAll(Map<String,Object> map, Integer statusId, String productName){
        List<Product> products = ps.selectAll(statusId, productName);
        for (Product product : products) {
            System.out.println("product = " + product);
        }
        map.put("list",products);
        map.put("list2",ss.selectAll());
        map.put("statusId",statusId);
        map.put("productName",productName);
        return "index";
    }

    @RequestMapping("selectone")
    public String selectOne(Model model,int product_id){
        model.addAttribute("pro",ps.selectone(product_id));
        model.addAttribute("statusList",ss.selectAll());
        return "update";
    }

    @RequestMapping("update")
    public String update(Product pd){
        ps.update(pd);
        return "redirect:/product/select";
    }
    @RequestMapping("/insert")
    public String insert(Product product){
        ps.insert(product);
        return "redirect:/product/select";
    }

    //删除
    @RequestMapping("delete")
    public String delete(int product_id){
        int i = ps.delete(product_id);
        return "redirect:/product/select";
    }
    //跳转到新增
    @RequestMapping("/toInsert")
    public String toInsert(Map<String,Object> map){
        map.put("list",ss.selectAll());
        return "insert";
    }

}
