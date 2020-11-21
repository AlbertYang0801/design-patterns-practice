package com.design.principle.Interfaceisolation.noisolation.service.impl;

import com.design.principle.Interfaceisolation.noisolation.service.TravelChargesService;

/**
 * 未进行接口隔离，需要实现不需要的方法
 * 飞机出行费用
 * @author Albert
 * @date 2020/11/8 00:30
 */
public class PlainServiceImpl implements TravelChargesService {
    @Override
    public int getFare() {
        System.out.println("飞机的出行费用为2000元");
        return 2000;
    }

    /**
     * 飞机不需要实现这个接口，是一个不需要的方法
     */
    @Override
    public int getTolls() {
        System.out.println("飞机没有过路费");
        return 0;
    }

    @Override
    public int getInfrastructure() {
        System.out.println("飞机的基建费用是50元");
        return 50;
    }


}
