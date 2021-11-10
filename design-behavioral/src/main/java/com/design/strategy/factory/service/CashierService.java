package com.design.strategy.factory.service;


import com.design.strategy.factory.facotry.BuyerFactory;
import com.design.strategy.factory.vo.User;
import com.design.strategy.practice.solved.Buyer;

import java.math.BigDecimal;

/**
 * 策略模式-上下文
 * 组合抽象策略类和工厂类
 *
 * @author Albert
 * @date 2021/1/20 上午11:03
 */
public class CashierService {

    /**
     * 收银，调用策略类的方法
     */
    public BigDecimal quote(User user, BigDecimal orderPrice) {
        //从工厂中获取指定策略类
        Buyer buyer = BuyerFactory.getBuyer(user);
        //根据策略类计算优惠后的价格
        return buyer.getDiscountPrice(orderPrice);
    }


}
