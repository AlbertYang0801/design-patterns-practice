package com.albert.practice.factory.factory;

import com.albert.practice.factory.phone.BasePhone;

/**
 * 抽象工厂类
 * 其子类对应实例化一种对象。
 * 扩展手机种类的时候，可以继承该抽象工厂扩展
 * 单个产品
 *
 * @author Albert
 * @date 2020/11/25 下午8:00
 */
public abstract class BasePhoneFactory {

    /**
     * 制作手机
     */
    public abstract BasePhone makePhone();


}
