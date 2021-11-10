package com.design.builder.practice.solved;

/**
 * 产品类-高楼
 * @author Albert
 * @date 2021/1/6 上午11:38
 */
public class HighHouse extends HouseBuilder {
    @Override
    void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    void roofed() {
        System.out.println("高楼封顶");
    }
}
