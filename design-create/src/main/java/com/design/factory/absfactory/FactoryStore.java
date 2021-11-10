package com.design.factory.absfactory;

/**
 * @author Albert
 * @date 2020/11/25 下午8:44
 */
public class FactoryStore {

    public static void main(String[] args) {
        //下订单，想购买华为系列的产品
        ProductOrder productOrder = new ProductOrder(1);
        productOrder.buy();
    }


}
