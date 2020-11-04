package com.design.principle.depeInversion.service.impl;

import com.design.principle.depeInversion.service.IMessageService;

/**
 * @author Albert
 * @date 2020/11/4 18:41
 */
public class PhoneUserImpl implements IMessageService {
    @Override
    public void sendMessage() {
        System.out.println("手机用户，发送消息");
    }
}
