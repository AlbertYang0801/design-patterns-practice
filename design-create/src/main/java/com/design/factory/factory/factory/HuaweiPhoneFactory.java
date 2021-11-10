package com.design.factory.factory.factory;


import com.design.factory.factory.phone.BasePhone;
import com.design.factory.factory.phone.HuaweiPhone;

/**
 * 工厂子类，具体创建实例对象的工厂
 * 华为手机工厂
 * @author Albert
 * @date 2020/11/25 下午8:01
 */
public class HuaweiPhoneFactory extends BasePhoneFactory{

    @Override
    public BasePhone makePhone() {
        return new HuaweiPhone();
    }


}
