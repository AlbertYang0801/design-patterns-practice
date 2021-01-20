package com.design.practice.solved;

import java.math.BigDecimal;

/**
 * 具体策略类-超级会员
 *
 * @author Albert
 * @date 2021/1/20 上午10:58
 */
public class SuperVipBuyer implements Buyer {
    @Override
    public BigDecimal getDiscountPrice(BigDecimal orderPrice) {
        return orderPrice.multiply(new BigDecimal("0.7"));
    }
}
