package com.design.command.order;

/**
 * @author yangjunwei
 * @date 2024/8/30
 */
public class OrderCommand implements Command {

    private Chef chef;

    public OrderCommand(Chef chef) {
        this.chef = chef;
    }


    @Override
    public void order() {
        chef.cook();
    }

    @Override
    public void cancelOrder() {
        chef.cancelCooking();
    }


}
