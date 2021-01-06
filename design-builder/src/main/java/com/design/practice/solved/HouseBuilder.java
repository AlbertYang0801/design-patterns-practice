package com.design.practice.solved;

/**
 * 建造者模式四大角色-抽象建造者
 * @author Albert
 * @date 2021/1/6 上午11:45
 */
public abstract class HouseBuilder {

    private final House house = new House();

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
    public House buildHouse(){
       return house;
    }


}
