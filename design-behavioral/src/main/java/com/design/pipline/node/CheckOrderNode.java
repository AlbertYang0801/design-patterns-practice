package com.design.pipline.node;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.design.pipline.flow.AbstractNode;
import com.design.pipline.flow.PipelineContext;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yangjunwei
 * @date 2024/8/27
 */
@Slf4j
public class CheckOrderNode implements AbstractNode<OrderVo> {

    @Override
    public void process(OrderVo input, PipelineContext<OrderVo> pipelineContext) {
        System.out.println("检查订单：" + input.getOrderNo());
        //检查订单
        if (!checkOrder(input)) {
            pipelineContext.setPiplineFinish();
            log.warn("order check fail! order:{}", JSONUtil.toJsonStr(input));
        }
    }

    private boolean checkOrder(OrderVo orderVo) {
        if (orderVo == null) {
            return false;
        }
        if (StrUtil.isEmpty(orderVo.getPhone()) || orderVo.getPhone().length() != 11) {
            return false;
        }
        return true;
    }


}
