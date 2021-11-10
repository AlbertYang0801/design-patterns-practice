package com.design.dutychain.handler;

/**
 * 董事长
 * @author Albert
 * @date 2021/2/27 下午5:24
 */
public class CeoHandler extends LeaderHandler{

    public CeoHandler(LeaderHandler parentNode) {
        super(parentNode);
    }

    @Override
    public String approve(int money) {
        return "ceo审批通过";
    }

    @Override
    public String askLeave(int days) {
        return "ceo批准假期";
    }

}
