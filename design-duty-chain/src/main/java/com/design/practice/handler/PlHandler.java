package com.design.practice.handler;

/**
 * 项目组长
 * 1000元以内可以做主
 *
 * @author Albert
 * @date 2021/2/27 下午5:21
 */
public class PlHandler extends LeaderHandler {

    public PlHandler(LeaderHandler parentNode) {
        super(parentNode);
    }

    @Override
    public String approve(int money) {
        int upperLimit = 1000;
        if (money > upperLimit) {
            //领导审批
            return parentNode.approve(money);
        }
        return "项目组长审批通过";
    }

    @Override
    public String askLeave(int days) {
        return parentNode.askLeave(days);
    }

}
