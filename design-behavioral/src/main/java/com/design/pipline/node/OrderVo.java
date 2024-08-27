package com.design.pipline.node;

import lombok.Data;

import java.util.Date;

/**
 * @author yangjunwei
 * @date 2024/8/27
 */
@Data
public class OrderVo {

    /**
     * 实际订单号 DB
     */
    private Integer id;

    private String name;

    /**
     * 逻辑订单号
     */
    private String  orderNo;

    private String phone;

    private String amt;

    private Date createTime;


}
