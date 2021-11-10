package com.design.factory.factory.phone;

/**
 * @author Albert
 * @date 2020/11/25 下午8:19
 */
public class HuaweiPhone implements BasePhone {

    public HuaweiPhone() {
        this.makePhone();
    }

    @Override
    public void makePhone() {
        System.out.println("制作华为手机");
    }


}
