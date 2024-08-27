package com.design.flyweight.shape;

import java.util.HashMap;

/**
 * @author yangjunwei
 * @date 2024/8/27
 */
public class ShapeFactory {

    //以颜色为纬度存放对象
    //享元模式，减少相同对象的创建
    private static final HashMap<String,Shape> circleMap = new HashMap<>();

    /**
     * 根据颜色选择
     * @param color
     * @return
     */
    public static Shape getCircle(String color) {
        if(circleMap.containsKey(color)) {
            return circleMap.get(color);
        }
        Circle circle = new Circle(color);
        circleMap.put(color, circle);
        return circle;
    }


}
