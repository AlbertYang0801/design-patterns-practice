package com.design.principle.ocp.unsolved;

/**
 *  开闭原则
 *  对扩展开放，对修改关闭
 *  增加图形，进行扩展修改的地方过多
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
        if(shape.type==1){
            drawCircle();
        }else if(shape.type==2){
            drawRectangle();
        }else if(shape.type==3){
            drawTriangle();
        }
    }

    private void drawCircle(){
        System.out.println("绘制圆形");
    }

    private void drawRectangle(){
        System.out.println("绘制矩形");
    }

    private void drawTriangle(){
        System.out.println("绘制三角形");
    }


}

class Shape{
    int type;

}

/**
 * 圆形
 */
class Circle extends Shape{
    Circle(){
        super.type = 1;
    }

}

/**
 * 矩形
 */
class Rectangle extends Shape{
    Rectangle(){
        super.type = 2;
    }

}

/**
 * 三角形
 */
class Triangle extends Shape{
    Triangle(){
        super.type = 3;
    }

}
