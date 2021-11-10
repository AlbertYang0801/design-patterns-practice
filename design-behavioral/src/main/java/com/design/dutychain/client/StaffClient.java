package com.design.dutychain.client;

import com.design.dutychain.handler.CeoHandler;
import com.design.dutychain.handler.GmHandler;
import com.design.dutychain.handler.PlHandler;

/**
 * @author Albert
 * @date 2021/2/27 下午6:29
 */
public class StaffClient {

    private static PlHandler plHandler;

    static {
        CeoHandler ceoHandler = new CeoHandler(null);
        GmHandler gmHandler = new GmHandler(ceoHandler);
        plHandler = new PlHandler(gmHandler);
    }

    public String approve(int money) {
        return plHandler.approve(money);
    }

    public String askLeave(int days) {
       return plHandler.askLeave(days);
    }

    public static void main(String[] args) {
        StaffClient staffClient = new StaffClient();
        System.out.println("----员工请假");
        String result = staffClient.askLeave(5);
        System.out.println(result);


        System.out.println("------员工申请金额");
        String approve = staffClient.approve(1500);
        System.out.println(approve);


    }


}
