package com.design.decorator;

import com.design.decorator.impl.AlertRobot;
import com.design.decorator.impl.MusicRobot;
import com.design.decorator.impl.WeatherDecoratorRobot;

/**
 * @author yjw
 * @date 2022/7/27 22:05
 */
public class TestDecorator {

    public static void main(String[] args) {
        AlertRobot alertRobot = new AlertRobot();
        MusicRobot musicRobot = new MusicRobot();

        WeatherDecoratorRobot weatherDecoratorRobot =new WeatherDecoratorRobot(alertRobot);
        weatherDecoratorRobot.name();
        weatherDecoratorRobot.work();
    }


}
