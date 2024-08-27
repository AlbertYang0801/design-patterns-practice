package com.design.pipline.flow;

/**
 * 定义pipline接口，表示一个流水线
 * @author yangjunwei
 * @date 2024/8/27
 */
public interface Pipeline<T> {

    /**
     * 添加一个阶段到pipline
     * @param abstractNode
     */
    void addStage(AbstractNode<T> abstractNode);

    /**
     * 执行pipline
     * @param input
     */
    void execute(T input);


}
