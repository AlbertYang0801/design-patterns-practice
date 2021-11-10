package com.design.dutychain.handler;

/**
 * 总监
 * 10000元以内可做主
 * @author Albert
 * @date 2021/2/27 下午5:21
 */
public class GmHandler extends LeaderHandler{

    public GmHandler(LeaderHandler parentNode) {
        super(parentNode);
    }

    @Override
    public String approve(int money) {
        int upperLimit = 10000;
        if(money>upperLimit){
            return parentNode.approve(money);
        }
        return "总监审批完成！";
    }

    @Override
    public String askLeave(int days) {
        return parentNode.askLeave(days);
    }
}
