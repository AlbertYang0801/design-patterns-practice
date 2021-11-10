package com.design.builder.practice.solved;

/**
 * 建造者模式四大角色-建造者
 * @author Albert
 * @date 2021/1/6 上午11:48
 */
public class CommonHouserBuilder extends HouseBuilder{
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
