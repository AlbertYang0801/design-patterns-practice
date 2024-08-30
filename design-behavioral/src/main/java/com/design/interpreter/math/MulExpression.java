package com.design.interpreter.math;

/**
 * @author yangjunwei
 * @date 2024/8/30
 */
public class MulExpression implements AbstractExpression {

    /**
     * 左边表达式
     */
    private AbstractExpression left;

    /**
     * 右边表达式
     */
    private AbstractExpression right;

    public MulExpression(AbstractExpression left, NumberExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }
}
