package com.design.mediator;

import com.design.mediator.code.User;

/**
 * 中介者模式
 * @author yangjunwei
 * @date 2024/8/30
 */
public class MediatorTest {

    public static void main(String[] args) {
        User user = new User("张三");
        User user1 = new User("李四");

        user.sendMessage("你好，李四");
        user1.sendMessage("你好，张三");
    }


}
