package com.design.mediator.code;

/**
 * @author yangjunwei
 * @date 2024/8/30
 */
public class ChatRoom {

    /**
     * @param user
     * @param message
     */
    public static void sendMessage(User user, String message) {
        System.out.println(user.getName()+"发送了消息："+message);
    }

}
