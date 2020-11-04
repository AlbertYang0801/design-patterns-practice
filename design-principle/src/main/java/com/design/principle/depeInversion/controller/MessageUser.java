package com.design.principle.depeInversion.controller;

import com.design.principle.depeInversion.service.IMessageService;
import com.design.principle.depeInversion.service.impl.EmailUserImpl;
import com.design.principle.depeInversion.service.impl.PhoneUserImpl;

/**
 * 依赖倒置
 * @author Albert
 * @date 2020/11/4 18:39
 */
public class MessageUser {

    /**
     * 类依赖抽象
     * 依赖抽象（接口或抽象类）
     */
    public void receiver(IMessageService iMessage){
        iMessage.sendMessage();
    }

    /**
     * 传入接口实现类
     */
    public static void main(String[] args) {
        MessageUser messageUser = new MessageUser();
        messageUser.receiver(new EmailUserImpl());
        messageUser.receiver(new PhoneUserImpl());
    }



}
