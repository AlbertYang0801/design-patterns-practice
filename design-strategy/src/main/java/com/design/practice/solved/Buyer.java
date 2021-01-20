package com.design.practice.solved;

import java.math.BigDecimal;

/**
 * 抽象策略类
 * @author Albert
 * @date 2021/1/20 上午10:57
 */
public interface Buyer {

    /**
     * 获取折扣价格
     * @param orderPrice 订单价格
     * @return 优惠后的价格
     */
    BigDecimal getDiscountPrice(BigDecimal orderPrice);

}
