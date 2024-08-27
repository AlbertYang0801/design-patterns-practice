package com.design.facade;

import com.design.facade.shape.ShapeMaker;

/**
 * 外观模式
 * 隐藏内部细节，提供一个对外接口
 *
 * @author yangjunwei
 * @date 2024/8/27
 */
public class FacadeTest {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
    }


}
