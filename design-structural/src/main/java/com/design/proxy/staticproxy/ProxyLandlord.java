package com.design.proxy.staticproxy;

/**
 * 代理中介
 *
 * @author Albert
 * @date 2021/3/11 上午11:33
 */
public class ProxyLandlord implements RentSubject {

    private RentSubject rentSubject;

    //注入房子
    public ProxyLandlord(RentSubject rentSubject) {
        this.rentSubject = rentSubject;
    }

    @Override
    public void findHouse(int money) {
        //收完中介费
        int proxyMoney = getProxyMoney(money);
        rentSubject.findHouse(proxyMoney);
    }

    /**
     * 收取中介费
     */
    private int getProxyMoney(int money) {
        System.out.println("中介收取100元中介费");
        return money - 100;
    }

}
