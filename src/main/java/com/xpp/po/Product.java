package com.xpp.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author XPP
 * @create 2019-11-21-14:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int productId;
    private String productName;
    private int productSum;
    private double productPrice;
    private Status status;

}
