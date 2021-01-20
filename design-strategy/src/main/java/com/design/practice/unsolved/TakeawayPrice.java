package com.design.practice.unsolved;

import java.math.BigDecimal;

/**
 * 未优化之前
 * 缺点：大量if-else，不符合开闭原则
 * @author Albert
 * @date 2021/1/20 上午10:09
 */
public class TakeawayPrice {

    /**
     * 需求1
     */
    public BigDecimal getDiscount(BigDecimal orderPrice, Integer buyType) {
        //超级会员打7折
        if (buyType.equals(BuyTypeEnum.SUPER_VIP.getType())) {
            return orderPrice.multiply(new BigDecimal("0.7"));
        }
        //会员打八折
        if (buyType.equals(BuyTypeEnum.VIP.getType())) {
            return orderPrice.multiply(new BigDecimal("0.8"));
        }
        //其余不打折
        return orderPrice;
    }

    /**
     * 需求2
     */
    public BigDecimal getDiscountTwo(BigDecimal orderPrice, Integer buyType) {
        //超级会员打7折
        if (buyType.equals(BuyTypeEnum.SUPER_VIP.getType())) {
            return orderPrice.multiply(new BigDecimal("0.7"));
        }
        //会员打八折
        if (buyType.equals(BuyTypeEnum.VIP.getType())) {
            return orderPrice.multiply(new BigDecimal("0.8"));
        }
        //店铺专属会员
        if (buyType.equals(BuyTypeEnum.SHOP_VIP.getType())) {
            //超过30打八折
            if (orderPrice.compareTo(new BigDecimal(30)) >= 0) {
                return orderPrice.multiply(new BigDecimal("0.8"));
            }
        }
        //其余不打折
        return orderPrice;
    }

    public static void main(String[] args) {
        TakeawayPrice takeawayPrice = new TakeawayPrice();
        BigDecimal discount = takeawayPrice.getDiscount(new BigDecimal(300), 0);
        System.out.println("超级会员的优惠价格："+discount);
    }


}

/**
 * 需求1：
 * 超级会员打七折
 * 会员打八折
 * 普通不打折
 * <p>
 * 需求2：
 * 增加一个店铺专属会员，打八折
 * 附加：在下单金额大于30元才可以打折。
 */
