package com.design.flyweight;

import com.design.flyweight.shape.Shape;
import com.design.flyweight.shape.ShapeFactory;

/**
 * @author yangjunwei
 * @date 2024/8/27
 */
public class FlyweightTest {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Shape circle = ShapeFactory.getCircle(getRandomColor());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }


}
