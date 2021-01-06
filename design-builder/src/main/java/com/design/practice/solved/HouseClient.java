package com.design.practice.solved;

import com.design.practice.unsolved.CommonHouse;

/**
 * @author Albert
 * @date 2021/1/6 上午11:33
 */
public class HouseClient {

    public static void main(String[] args) {
        HouseConductor houseConductor = new HouseConductor(new CommonHouserBuilder());
        House commonHouse = houseConductor.manageBuildHouse();
        System.out.println(commonHouse);

        houseConductor.setHouseBuilder(new HighHouse());
        House highHouse = houseConductor.manageBuildHouse();
        System.out.println(highHouse);
    }


}
