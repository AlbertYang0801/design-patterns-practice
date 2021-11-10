package com.design.builder.practice.unsolved;

/**
 * 传统的产品构建过程
 * @author Albert
 * @date 2021/1/6 上午11:28
 */
public abstract class AbstractHouse {

    /**
     * 打地基
     */
    abstract void buildBasic();

    /**
     * 砌墙
     */
    abstract void buildWalls();

    /**
     * 封顶
     */
    abstract void roofed();

    /**
     * 产品建造过程
     */
    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }


}
