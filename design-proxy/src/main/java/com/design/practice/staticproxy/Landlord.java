package com.design.practice.staticproxy;

/**
 * 房东类
 * @author Albert
 * @date 2021/3/11 上午11:32
 */
public class Landlord implements RentSubject{
    @Override
    public void findHouse(int money) {
        System.out.println("房东收到房租！"+money);
    }
}
