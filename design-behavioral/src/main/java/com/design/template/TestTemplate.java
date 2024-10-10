package com.design.template;

import com.design.template.impl.LowerRoom;
import com.design.template.impl.StarLevelRoom;

/**
 * 模版模式
 * @author yjw
 * @date 2022/7/27 21:14
 */
public class TestTemplate {

    public static void main(String[] args) {
        System.out.println("------1.入住星级酒店----------");
        AbstractRoom starLevelRoom = new StarLevelRoom();
        starLevelRoom.getRoom();
        System.out.println("------2.入住低端酒店----------");
        AbstractRoom lowerRoom = new LowerRoom();
        lowerRoom.getRoom();
    }


}
