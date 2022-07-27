package com.design.template.impl;

import com.design.template.AbstractRoom;

/**
 * @author yjw
 * @date 2022/7/27 21:11
 */
public class StarLevelRoom extends AbstractRoom {
    @Override
    public Integer chooseRoomType(int roomType) {
        System.out.println("房费不定");
        switch (roomType){
            case 1:
                return 300;
            case 2:
                return 500;
            case 3:
                return 1000;
            default:
               return 0;
        }
    }

    @Override
    public void payment(int money) {
        System.out.println("支付："+money);
    }


}
