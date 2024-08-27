package com.design.pipline;

import com.design.pipline.flow.DefaultPipeline;
import com.design.pipline.node.CheckOrderNode;
import com.design.pipline.node.OrderVo;
import com.design.pipline.node.SaveOrderNode;
import com.design.pipline.node.SendDelayOrderNode;

/**
 * @author yangjunwei
 * @date 2024/8/27
 */
public class PiplineTest {

    public static void main(String[] args) {
        OrderVo orderVo = new OrderVo();
        orderVo.setAmt("100");
        //orderVo.setPhone("18438049177");
        orderVo.setOrderNo("1614");

        //创建流水线
        DefaultPipeline<OrderVo> pipeline = new DefaultPipeline<>();
        pipeline.addStage(new CheckOrderNode());
        pipeline.addStage(new SaveOrderNode());
        pipeline.addStage(new SendDelayOrderNode());

        //执行流水线
        pipeline.execute(orderVo);
    }


}
