package com.design.dutychain.client;

import com.design.dutychain.handler.CeoHandler;
import com.design.dutychain.handler.GmHandler;
import com.design.dutychain.handler.PlHandler;

/**
 * 审批流
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

    /**
     * 从pl开始审批
     * pl-gm-ceo
     * @param money
     * @return
     */
    public String approve(int money) {
        return plHandler.approve(money);
    }

    public String askLeave(int days) {
       return plHandler.askLeave(days);
    }


}
