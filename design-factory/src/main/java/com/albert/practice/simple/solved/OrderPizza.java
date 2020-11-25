package com.albert.practice.simple.solved;

import com.albert.practice.simple.base.BasePizzaMake;

import java.util.Objects;

/**
 * 订购披萨
 * @author Albert
 * @date 2020/11/25 下午3:39
 */
public class OrderPizza {

    SimpleFactory simpleFactory = new SimpleFactory();

     OrderPizza(Integer pizzaType){
        BasePizzaMake pizza = simpleFactory.createPizza(pizzaType);
        if(Objects.isNull(pizza)){
            System.out.println("您要订购的披萨不存在");
            return;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }


}


/**
 * 在订单类里根据披萨类型创建披萨对象。若要增加披萨种类，则需要修改订单类，违背开闭原则。
 * 优化：
 * 可将根据披萨类型创建披萨对象的过程，封装到一个类，即简单工厂。
 * 对披萨种类的新增修改等都在简单工厂类进行，其它使用到披萨对象的地方无需修改。
 */