package com.design.proxy;

import com.design.proxy.staticproxy.Landlord;
import com.design.proxy.staticproxy.ProxyLandlord;

/**
 * 代理模式
 * @author yangjunwei
 * @date 2024/8/27
 */
public class ProxyTest {

    public static void main(String[] args) {
        //告诉中介要租的房子
        ProxyLandlord proxyLandlord = new ProxyLandlord(new Landlord());
        //支付中介房租
        proxyLandlord.findHouse(1000);
    }


}
