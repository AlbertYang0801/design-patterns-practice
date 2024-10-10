package com.design.mediator.code;

import lombok.Data;

/**
 * @author yangjunwei
 * @date 2024/8/30
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void sendMessage(String message) {
        //原本用户一对一聊天，改为通过聊天室聊天
        //向聊天室发消息
        ChatRoom.sendMessage(this, message);
    }

}
