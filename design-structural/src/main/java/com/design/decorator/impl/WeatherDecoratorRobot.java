package com.design.decorator.impl;

import com.design.decorator.DecoratorRobot;
import com.design.decorator.Robot;

/**
 * @author yjw
 * @date 2022/7/27 22:01
 */
public class WeatherDecoratorRobot extends DecoratorRobot {

    public WeatherDecoratorRobot(Robot decoratorRobot) {
        super(decoratorRobot);
    }

    @Override
    public void name() {
        super.name();
        String nameType = nameType();
        System.out.println(nameType);
    }

    @Override
    public void work() {
        super.work();
        weather();
    }

    private String nameType(){
        if(decoratorRobot instanceof AlertRobot){
            return "告警";
        }
        if(decoratorRobot instanceof MusicRobot){
            return "音乐";
        }
        return "类型不详细";
    }

    private void weather(){
        System.out.println("可以进行天气预报");
    }


}
