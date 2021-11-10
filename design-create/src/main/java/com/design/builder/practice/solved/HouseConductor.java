package com.design.builder.practice.solved;

/**
 * 建造者四大角色-指挥者
 * @author Albert
 * @date 2021/1/6 上午11:50
 */
public class HouseConductor {

    HouseBuilder houseBuilder;

    public HouseConductor(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 调用指挥者，指定建造者对象，返回创建完成的产品对象
     */
    public House manageBuildHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }


}
