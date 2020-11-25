package com.albert.practice.absfactory.factory;

import com.albert.practice.absfactory.pc.BasePc;
import com.albert.practice.factory.phone.BasePhone;

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



}
