package com.design.practice.solved;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 具体策略类-店铺专属会员
 *
 * @author Albert
 * @date 2021/1/20 上午11:01
 */
@Component
public class ShopVipBuyer implements Buyer {
    @Override
    public BigDecimal getDiscountPrice(BigDecimal orderPrice) {
        if (orderPrice.compareTo(new BigDecimal(30)) > 0) {
            return orderPrice.multiply(new BigDecimal("0.8"));
        }
        return orderPrice;
    }

}
