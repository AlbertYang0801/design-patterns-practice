package com.design.dutychain.handler;

/**
 * @author Albert
 * @date 2021/2/27 下午5:07
 */
public abstract class LeaderHandler {

    /**
     * 下一节点审批人
     */
    protected LeaderHandler parentNode;

    public LeaderHandler(LeaderHandler parentNode){
        this.parentNode=parentNode;
    }

    /**
     * 审批金额
     * @param money 审批金额
     * @return 审批结果
     */
    public abstract String approve(int money);

    /**
     * 请假
     * @param days 天数
     * @return 审批结果
     */
    public abstract String askLeave(int days);


}
