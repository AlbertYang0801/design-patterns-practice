package com.design.practice.staticproxy;

/**
 * 用户类
 * @author Albert
 * @date 2021/3/11 上午11:32
 */
public class Student {

    public static void main(String[] args) {
        //找中介买这套房子
        ProxyLandlord proxyLandlord = new ProxyLandlord(new Landlord());
        //掏钱
        proxyLandlord.findHouse(1000);

    }


}
