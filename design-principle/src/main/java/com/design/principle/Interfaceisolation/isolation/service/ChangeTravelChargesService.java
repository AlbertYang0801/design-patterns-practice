package com.design.principle.Interfaceisolation.isolation.service;

/**
 * 出行收费接口，将不是公有的方法进行接口隔离
 * @author Albert
 * @date 2020/11/8 00:25
 */
public interface ChangeTravelChargesService {

    /**
     * 获取基本出行票钱（汽车、飞机等基本费用）
     */
    int  getFare();


}
