package com.design.strategy.practice.solved;


import java.math.BigDecimal;

/**
 * 策略模式-上下文
 * 组合抽象策略类
 *
 * @author Albert
 * @date 2021/1/20 上午11:03
 */
public class Cashier {

    /**
     * 组合方式，集成策略类（符合合成复用原则）
     */
    private Buyer buyer;

    public Cashier(Buyer buyer) {
        this.buyer = buyer;
    }

    /**
     * 收银，调用策略类的方法
     */
    public BigDecimal quote(BigDecimal orderPrice) {
        return this.buyer.getDiscountPrice(orderPrice);
    }

    public static void main(String[] args) {
        //定义超级会员
        Buyer superVipBuyer = new SuperVipBuyer();
        //定义上下文
        Cashier cashier = new Cashier(superVipBuyer);
        BigDecimal superVipBuyerQuote = cashier.quote(new BigDecimal(300));
        System.out.println("超级会员的优惠价格为:" + superVipBuyerQuote);
    }


}
