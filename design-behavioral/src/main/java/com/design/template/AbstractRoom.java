package com.design.template;

/**
 * 模板方法练习
 * @author yjw
 * @date 2022/7/27 21:07
 */
public abstract class AbstractRoom {

    public abstract Integer chooseRoomType(int roomType);

    public abstract void payment(int money);

    /**
     * 提高外部调用的方法
     * 规定了方法步骤，类似模板。
     * 子类去实现模板中的各个步骤。
     * 可变部分由子类去实现，不可变部分抽象类实现。
     */
    public final void getRoom(){
        System.out.println("欢迎光临");
        Integer money = chooseRoomType(1);
        payment(money);
        System.out.println("谢谢惠顾");
    }

}
