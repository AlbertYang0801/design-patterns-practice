package com.design.strategy.factory.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户
 * @author yjw
 * @date 2021/1/20 21:42
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     * 用户名
     */
    private String name;
    /**
     * 会员类型
     */
    private Integer buyerType;


}
