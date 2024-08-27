package com.design.pipline.flow;

import java.util.ArrayList;
import java.util.List;

/**
 * 默认pipline
 *
 * @author yangjunwei
 * @date 2024/8/27
 */
public class DefaultPipeline<T> implements Pipeline<T> {

    /**
     * 流水线所有阶段
     */
    private List<AbstractNode<T>> abstractNodes;

    /**
     * 流水线当前阶段
     */
    private int index;

    /**
     * 上下文对象
     */
    private PipelineContext<T> context;

    public DefaultPipeline() {
        abstractNodes = new ArrayList<>();
        //创建时初始化
        this.context = new PipelineContext<>();
    }

    @Override
    public void addStage(AbstractNode<T> abstractNode) {
        abstractNodes.add(abstractNode);
    }

    @Override
    public void execute(T input) {
        //按顺序执行所有node
        for (AbstractNode<T> abstractNode : abstractNodes) {
            if(context.isProcessFinish()){
                return;
            }
            //处理pipline当前node
            //所有node共用一个context
            abstractNode.process(input, context);
        }
    }


}
