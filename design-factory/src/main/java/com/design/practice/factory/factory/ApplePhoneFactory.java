package com.design.practice.factory.factory;

import com.design.practice.factory.phone.Iphone;
import com.design.practice.factory.phone.BasePhone;

/**
 * 工厂子类，具体创建实例对象的工厂
 * 苹果手机工厂
 *
 * @author Albert
 * @date 2020/11/25 下午8:01
 */
public class ApplePhoneFactory extends BasePhoneFactory {

    @Override
    public BasePhone makePhone() {
        return new Iphone();
    }


}
