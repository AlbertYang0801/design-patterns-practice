package com.design.dutychain;

import com.design.dutychain.client.StaffClient;

/**
 * 责任链模式
 * @author yangjunwei
 * @date 2024/8/27
 */
public class DutyChainTest {

    public static void main(String[] args) {
        //从pl开始审批，走pl-gm-ceo
        StaffClient staffClient = new StaffClient();
        System.out.println("----员工请假");
        String result = staffClient.askLeave(5);
        System.out.println(result);


        System.out.println("------员工申请金额");
        String approve = staffClient.approve(1500);
        System.out.println(approve);
    }


}
