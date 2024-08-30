package com.design.command.order;

/**
 * 基础命令类
 * @author yangjunwei
 * @date 2024/8/30
 */
public interface Command {

    /**
     * 下订单
     */
    void order();

    /**
     * 取消订单
     */
    void cancelOrder();


}
