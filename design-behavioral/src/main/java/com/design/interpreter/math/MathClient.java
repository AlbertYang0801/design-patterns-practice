package com.design.interpreter.math;

/**
 * @author yangjunwei
 * @date 2024/8/30
 */
public class MathClient {

    /**
     * 计算表达式
     * 加减乘除都是先左后右
     *
     * @param express
     * @return
     */
    public int execute(String express) {
        String[] elements = express.split(" ");
        if (elements.length % 2 == 0) {
            throw new RuntimeException("表达式错误");
        }
        AbstractExpression abstractExpression = new NumberExpression(Integer.parseInt(elements[0]));
        for (int i = 1; i < elements.length - 1; i += 2) {
            String symbol = elements[i];
            int num;
            try {
                num = Integer.parseInt(elements[i + 1]);
            } catch (NumberFormatException e) {
                throw new RuntimeException("表达式错误");
            }
            //重复计算左边的表达式
            if (symbol.equals("+")) {
                abstractExpression = new AddExpression(abstractExpression, new NumberExpression(num));
            } else if (symbol.equals("-")) {
                abstractExpression = new SubExpression(abstractExpression, new NumberExpression(num));
            } else if (symbol.equals("*")) {
                abstractExpression = new MulExpression(abstractExpression, new NumberExpression(num));
            } else if (symbol.equals("/")) {
                abstractExpression = new DivExpression(abstractExpression, new NumberExpression(num));
            }
        }
        return abstractExpression.interpret();
    }


}
