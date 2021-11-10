package com.design.builder.practice.unsolved;

/**
 * @author Albert
 * @date 2021/1/6 上午11:33
 */
public class HouseClient {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
        HighHouse highHouse = new HighHouse();
        highHouse.build();
    }


}
