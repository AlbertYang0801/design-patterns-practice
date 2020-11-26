package com.design.practice.absfactory.factory;

import com.design.practice.absfactory.headset.BaseHeadset;
import com.design.practice.absfactory.headset.FreeBuds;
import com.design.practice.absfactory.pc.BasePc;
import com.design.practice.absfactory.pc.HuaweiPc;
import com.design.practice.factory.phone.BasePhone;
import com.design.practice.factory.phone.HuaweiPhone;

/**
 * 工厂子类，具体创建实例对象的工厂
 * 华为工厂，可生产多个产品
 * @author Albert
 * @date 2020/11/25 下午8:01
 */
public class HuaweiFactory extends BaseFactory {

    @Override
    public BasePhone makePhone() {
        return new HuaweiPhone();
    }

    @Override
    public BasePc makePc() {
        return new HuaweiPc();
    }

    @Override
    public BaseHeadset makeHeadset() {
        return new FreeBuds();
    }


}
