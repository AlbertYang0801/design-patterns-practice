package com.albert.practice.absfactory.factory;

import com.albert.practice.absfactory.pc.BasePc;
import com.albert.practice.absfactory.pc.MacPc;
import com.albert.practice.factory.phone.BasePhone;
import com.albert.practice.factory.phone.Iphone;

/**
 * 工厂子类，具体创建实例对象的工厂
 * 苹果工厂，可生产多个产品
 *
 * @author Albert
 * @date 2020/11/25 下午8:01
 */
public class AppleFactory extends BaseFactory {

    @Override
    public BasePhone makePhone() {
        return new Iphone();
    }

    @Override
    public BasePc makePc() {
        return new MacPc();
    }


}
