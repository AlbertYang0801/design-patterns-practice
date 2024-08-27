package com.design.facade.shape;

/**
 * @author yangjunwei
 * @date 2024/8/27
 */
public class ShapeMaker {

    private Circle circle;

    private Square square;

    public ShapeMaker() {
        circle = new Circle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

}
