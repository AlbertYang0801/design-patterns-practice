package com.design.principle.ocp.solved;

/**
 * 开闭原则
 * 对扩展开放，对修改关闭
 * 优化代码扩展
 * @author Albert
 * @date 2020/11/9 00:09
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Triangle());
    }


}

class GraphicEditor{

    public void drawShape(Shape shape){
      shape.draw();
    }


}

abstract class Shape{

    int type;

    /**
     * 将基础方法抽到基类中
     */
    abstract void draw();

}

/**
 * 圆形
 */
class Circle extends Shape{
    Circle(){
        super.type = 1;
    }

    @Override
    void draw() {
        System.out.println("绘制圆形");
    }
}

/**
 * 矩形
 */
class Rectangle extends Shape{
    Rectangle(){
        super.type = 2;
    }

    @Override
    void draw() {
        System.out.println("绘制矩形");
    }
}

/**
 * 三角形
 */
class Triangle extends Shape{
    Triangle(){
        super.type = 3;
    }

    @Override
    void draw() {
        System.out.println("绘制三角形");
    }
}
