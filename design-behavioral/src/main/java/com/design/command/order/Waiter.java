package com.design.command.order;

/**
 * @author yangjunwei
 * @date 2024/8/30
 */
public class Waiter {

    private Command command;

    public Waiter(Command command) {
        this.command = command;
    }

    public void takeOrder(){
        System.out.println("服务员开始点菜");
        command.order();
    }

    public void cancelOrder(){
        System.out.println("服务员取消点菜");
        command.cancelOrder();
    }


}
