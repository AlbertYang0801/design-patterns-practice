package com.design.factory.absfactory.factory;


import com.design.factory.absfactory.headset.BaseHeadset;
import com.design.factory.absfactory.pc.BasePc;
import com.design.factory.factory.phone.BasePhone;

/**
 * 抽象工厂类
 * 多个产品
 * @author Albert
 * @date 2020/11/25 下午8:00
 */
public abstract class BaseFactory {

    /**
     * 制作手机
     */
    public abstract BasePhone makePhone();

    /**
     * 制作电脑
     */
    public abstract BasePc makePc();

    /**
     * 制作耳机
     */
    public abstract BaseHeadset makeHeadset();


}
