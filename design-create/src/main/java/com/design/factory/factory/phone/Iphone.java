package com.design.factory.factory.phone;

/**
 * @author Albert
 * @date 2020/11/25 下午8:19
 */
public class Iphone implements BasePhone {

    public Iphone() {
        this.makePhone();
    }

    @Override
    public void makePhone() {
        System.out.println("制作苹果手机");
    }


}
