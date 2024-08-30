package com.design.interpreter.math;

/**
 * @author yangjunwei
 * @date 2024/8/30
 */
public class NumberExpression implements AbstractExpression{

    private int number;

    NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
