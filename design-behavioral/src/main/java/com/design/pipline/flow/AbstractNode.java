package com.design.pipline.flow;

/**
 * 流水线的一个节点
 *
 * @author yangjunwei
 * @date 2024/8/27
 */
public interface AbstractNode<T> {

    /**
     * 处理输入数据
     *
     * @param input           输入数据
     * @param pipelineContext 上下文对象
     * @return
     */
    void process(T input, PipelineContext<T> pipelineContext);


}
