package com.design.pipline.node;

import cn.hutool.core.lang.UUID;
import com.design.pipline.flow.AbstractNode;
import com.design.pipline.flow.PipelineContext;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yangjunwei
 * @date 2024/8/27
 */
@Slf4j
public class SaveOrderNode implements AbstractNode<OrderVo> {

    @Override
    public void process(OrderVo input, PipelineContext<OrderVo> pipelineContext) {
        //保存订单
        System.out.println("保存订单：" + input.getOrderNo());


        try {
            //模拟DB
            String orderId = UUID.fastUUID().toString();
            pipelineContext.put("orderId", orderId);
        } catch (Exception e) {
            pipelineContext.setPiplineFinish();
            log.error("save order error", e);
        }

    }


}
