package com.design.principle.Interfaceisolation.noisolation.service.impl;

import com.design.principle.Interfaceisolation.noisolation.service.TravelChargesService;

/**
 * 未进行接口隔离，需要实现不需要的方法
 * 汽车出行费用
 * @author Albert
 * @date 2020/11/8 00:30
 */
public class CarServiceImpl implements TravelChargesService {
    @Override
    public int getFare() {
        System.out.println("汽车的出行费用是100元");
        return 100;
    }

    @Override
    public int getTolls() {
        System.out.println("汽车的过路费是10元");
        return 10;
    }

    /**
     * 汽车不需要实现这个接口，是一个不需要的方法
     */
    @Override
    public int getInfrastructure() {
        System.out.println("汽车没有基建费用");
        return 0;
    }
}
