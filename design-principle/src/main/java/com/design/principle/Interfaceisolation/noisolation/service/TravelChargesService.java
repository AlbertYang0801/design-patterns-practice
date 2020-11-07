package com.design.principle.Interfaceisolation.noisolation.service;

/**
 * 出行收费接口
 * 未进行接口隔离，该接口内有其实现类不需要的方法
 * @author Albert
 * @date 2020/11/8 00:25
 */
public interface TravelChargesService {

    /**
     * 获取基本出行票钱（汽车、飞机等基本费用）
     */
    int  getFare();

    /**
     * 获取过路费（汽车的高速过路费）
     */
    int getTolls();

    /**
     * 获取飞机的基建费用
     */
    int getInfrastructure();


}
