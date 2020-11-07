package com.design.principle.Interfaceisolation.isolation;

import com.design.principle.Interfaceisolation.isolation.service.impl.CarServiceImpl;
import com.design.principle.Interfaceisolation.isolation.service.impl.PlainServiceImpl;

/**
 * 进行了接口隔离的测试类
 *
 * 分别获取汽车和飞机的出行费用
 * @author Albert
 * @date 2020/11/8 00:34
 */
public class TravelCharges {

    /**
     * 获取汽车出行费用
     */
    public void getCarTravelCharges(CarServiceImpl carService){
        int fare = carService.getFare();
        int tolls = carService.getTolls();
        System.out.println("汽车出行费用为："+(fare+tolls));
    }

    /**
     * 获取飞机出行费用
     */
    public void getPlainTravelCharges(PlainServiceImpl plainService){
        int fare = plainService.getFare();
        int infrastructure = plainService.getInfrastructure();
        System.out.println("飞机出行费用为："+(fare+infrastructure));

    }

    public static void main(String[] args) {
        TravelCharges travelCharges = new TravelCharges();
        //获取汽车出行费用
        travelCharges.getCarTravelCharges(new CarServiceImpl());
        //获取飞机出行费用
        travelCharges.getPlainTravelCharges(new PlainServiceImpl());
    }


}
