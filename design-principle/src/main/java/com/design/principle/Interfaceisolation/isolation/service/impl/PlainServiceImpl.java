package com.design.principle.Interfaceisolation.isolation.service.impl;

import com.design.principle.Interfaceisolation.isolation.service.ChangeTravelChargesService;
import com.design.principle.Interfaceisolation.isolation.service.PlainService;

/**
 * 进行接口隔离
 * 飞机出行费用
 * @author Albert
 * @date 2020/11/8 00:30
 */
public class PlainServiceImpl implements ChangeTravelChargesService, PlainService {

    @Override
    public int getFare() {
        System.out.println("飞机的出行费用为2000元");
        return 2000;
    }

    @Override
    public int getInfrastructure() {
        System.out.println("飞机的基建费用是50元");
        return 50;
    }


}
