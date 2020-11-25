package com.albert.factory.simple.unsolved;

import com.albert.factory.simple.base.BasePizzaMake;
import com.albert.factory.simple.base.CheesePizza;
import com.albert.factory.simple.base.ChinaPizza;

/**
 * 订购披萨
 *
 * @author Albert
 * @date 2020/11/25 下午3:39
 */
public class OrderPizza {

    BasePizzaMake basePizzaMake = null;

    OrderPizza(Integer pizzaType) {
        //在订单类里进行判断披萨种类，违背开闭原则。
        if (pizzaType == 0) {
            System.out.println("开始订购芝士披萨");
            basePizzaMake = new CheesePizza();
        }
        if (pizzaType == 1) {
            System.out.println("开始订购中国披萨");
            basePizzaMake = new ChinaPizza();
        } else {
            System.out.println("您要购买的披萨种类不存在");
            return;
        }
        //开始制作披萨
        basePizzaMake.prepare();
        basePizzaMake.bake();
        basePizzaMake.cut();
        basePizzaMake.box();
    }


}


/**
 * 在订单类里根据披萨类型创建披萨对象。若要增加披萨种类，则需要修改订单类，违背开闭原则。
 * 优化：
 * 可将根据披萨类型创建披萨对象的过程，封装到一个类，即简单工厂。
 * 对披萨种类的新增修改等都在简单工厂类进行，其它使用到披萨对象的地方无需修改。
 */