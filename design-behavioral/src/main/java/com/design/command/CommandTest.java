package com.design.command;

import com.design.command.order.Chef;
import com.design.command.order.OrderCommand;
import com.design.command.order.Waiter;

/**
 * 命令模式
 * @author yangjunwei
 * @date 2024/8/30
 */
public class CommandTest {


    public static void main(String[] args) {
        Waiter waiter = new Waiter(new OrderCommand(new Chef()));
        waiter.takeOrder();
        waiter.cancelOrder();
    }


}
