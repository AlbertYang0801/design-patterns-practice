package com.design.interpreter;

import com.design.interpreter.math.MathClient;

/**
 * 解释器模式
 * @author yangjunwei
 * @date 2024/8/30
 */
public class InterpreterTest {

    public static void main(String[] args) {
        MathClient client = new MathClient();
        System.out.println(client.execute("2 + 3 * 4 / 2"));
    }


}




