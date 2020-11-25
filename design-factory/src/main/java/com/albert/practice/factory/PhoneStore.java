package com.albert.practice.factory;

import com.albert.practice.factory.factory.ApplePhoneFactory;
import com.albert.practice.factory.factory.HuaweiPhoneFactory;

/**
 * @author Albert
 * @date 2020/11/25 下午8:07
 */
public class PhoneStore {

    public static void main(String[] args) {
        //指定需要的手机类型
        ApplePhoneFactory applePhoneFactory = new ApplePhoneFactory();
        applePhoneFactory.makePhone();

        HuaweiPhoneFactory huaweiPhoneFactory=new HuaweiPhoneFactory();
        huaweiPhoneFactory.makePhone();
    }


}
