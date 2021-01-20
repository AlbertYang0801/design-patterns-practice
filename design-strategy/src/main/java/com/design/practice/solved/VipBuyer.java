package com.design.practice.solved;

import java.math.BigDecimal;

/**
 * 具体策略类-VIP
 *
 * @author Albert
 * @date 2021/1/20 上午11:00
 */
public class VipBuyer implements Buyer {
    @Override
    public BigDecimal getDiscountPrice(BigDecimal orderPrice) {
        return orderPrice.multiply(new BigDecimal("0.8"));
    }
}
