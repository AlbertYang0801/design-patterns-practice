package com.design.pipline.node;

import cn.hutool.core.util.StrUtil;
import com.design.pipline.flow.AbstractNode;
import com.design.pipline.flow.PipelineContext;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yangjunwei
 * @date 2024/8/27
 */
@Slf4j
public class SendDelayOrderNode implements AbstractNode<OrderVo> {

    @Override
    public void process(OrderVo input, PipelineContext<OrderVo> pipelineContext) {
        //延时订单
        System.out.println("发送延时订单：" + input.getOrderNo());

        String orderId = pipelineContext.getOrDefault("orderId", "").toString();
        if(StrUtil.isNotBlank(orderId)){
            pipelineContext.setPiplineFinish();
            log.info("context orderId empty");
            return;
        }

        //模拟发送延时订单
        sendDelayOrder(orderId);
    }

    private void sendDelayOrder(String orderId) {

    }


}
