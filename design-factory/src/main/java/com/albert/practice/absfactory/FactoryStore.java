package com.albert.practice.absfactory;

import com.albert.practice.absfactory.factory.AppleFactory;
import com.albert.practice.absfactory.factory.HuaweiFactory;

/**
 * @author Albert
 * @date 2020/11/25 下午8:44
 */
public class FactoryStore {

    public static void main(String[] args) {
        AppleFactory appleFactory= new AppleFactory();
        appleFactory.makePc();
        appleFactory.makePhone();

        HuaweiFactory huaweiFactory = new HuaweiFactory();
        huaweiFactory.makePc();
        huaweiFactory.makePhone();
    }


}
