package com.design.principle.Interfaceisolation.isolation.service.impl;

import com.design.principle.Interfaceisolation.isolation.service.CarService;
import com.design.principle.Interfaceisolation.isolation.service.ChangeTravelChargesService;

/**
 * 进行接口隔离
 * 汽车出行费用
 * @author Albert
 * @date 2020/11/8 00:30
 */
public class CarServiceImpl implements ChangeTravelChargesService, CarService {
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

}
