package com.design.factory.simple.solved;

import com.design.factory.simple.base.BasePizzaMake;
import com.design.factory.simple.base.CheesePizza;
import com.design.factory.simple.base.ChinaPizza;

/**
 * 简单工厂
 * 提供根据披萨类型创建披萨对象的功能
 * @author Albert
 * @date 2020/11/25 下午3:59
 */
public class SimpleFactory {

    /**
     * 根据披萨类型创建披萨对象
     */
    public BasePizzaMake createPizza(Integer pizzaType) {
        BasePizzaMake basePizzaMake = null;
        //在简单工厂里进行披萨类型的判断并创建对应披萨。
        if (pizzaType == 0) {
            System.out.println("开始订购芝士披萨");
            basePizzaMake = new CheesePizza();
        }
        if (pizzaType == 1) {
            System.out.println("开始订购中国披萨");
            basePizzaMake = new ChinaPizza();
        }
        return basePizzaMake;
    }


}
