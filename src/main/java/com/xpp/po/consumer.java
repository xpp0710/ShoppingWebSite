package com.xpp.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author XPP
 * @create 2019-11-27-14:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class consumer {
    private int consumerId;
    private String  consumerUserName;
    private String  consumerPassWord;
}
