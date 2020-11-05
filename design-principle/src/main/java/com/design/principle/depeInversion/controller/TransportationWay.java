package com.design.principle.depeInversion.controller;

import com.design.principle.depeInversion.service.IMessageService;
import com.design.principle.depeInversion.service.ITransportationService;
import com.design.principle.depeInversion.service.impl.CarServiceImpl;
import com.design.principle.depeInversion.service.impl.EmailUserImpl;
import com.design.principle.depeInversion.service.impl.PhoneUserImpl;
import com.design.principle.depeInversion.service.impl.PlainServiceImpl;

/**
 * 依赖倒置
 * @author Albert
 * @date 2020/11/4 18:39
 */
public class TransportationWay {

    /**
     * 类依赖抽象
     * 不依赖具体的实现类，而是依赖抽象（接口或抽象类）
     * 面向接口编程
     * 体现了多态
     */
    public void way(ITransportationService iTransportationService){
        String way = iTransportationService.way();
        System.out.println(way);
    }

    public static void main(String[] args) {
        TransportationWay transportationWay = new TransportationWay();
        //依赖实现类转换为依赖接口
        transportationWay.way(new PlainServiceImpl());
        transportationWay.way(new CarServiceImpl());
    }


}
