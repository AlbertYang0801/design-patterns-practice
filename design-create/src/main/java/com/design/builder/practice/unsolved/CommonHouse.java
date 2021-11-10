package com.design.builder.practice.unsolved;

/**
 * 产品类-普通房子
 * @author Albert
 * @date 2021/1/6 上午11:28
 */
public class CommonHouse extends AbstractHouse {


    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }


}
