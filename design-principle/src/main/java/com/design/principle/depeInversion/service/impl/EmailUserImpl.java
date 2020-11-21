package com.design.principle.depeInversion.service.impl;

import com.design.principle.depeInversion.service.IMessageService;

/**
 * @author Albert
 * @date 2020/11/4 18:41
 */
public class EmailUserImpl implements IMessageService {

    @Override
    public void sendMessage() {
        System.out.println("邮箱用户，发送消息");
    }


}
