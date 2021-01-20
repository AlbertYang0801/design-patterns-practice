package com.design.practice.solved;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 具体策略类-超级会员
 *
 * @author Albert
 * @date 2021/1/20 上午10:58
 */
@Component
public class SuperVipBuyer implements Buyer {
    @Override
    public BigDecimal getDiscountPrice(BigDecimal orderPrice) {
        return orderPrice.multiply(new BigDecimal("0.7"));
    }
}
