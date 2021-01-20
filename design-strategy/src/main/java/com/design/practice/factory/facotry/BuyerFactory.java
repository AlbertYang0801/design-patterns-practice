package com.design.practice.factory.facotry;

import com.design.practice.factory.utils.FrameSpringBeanUtil;
import com.design.practice.factory.vo.BuyerEnum;
import com.design.practice.factory.vo.User;
import com.design.practice.solved.Buyer;
import org.springframework.stereotype.Component;

/**
 * 工厂模式-创建策略对象
 * 从容器上下文中获取策略类
 *
 * @author yjw
 * @date 2021/1/20 21:20
 */
@Component
public class BuyerFactory {

    /**
     * 根据用户会员类型获取对应的策略
     */
    public static Buyer getBuyer(User user) {
        //根据会员类型获取策略类对象
        String buyerClassName = BuyerEnum.getBuyerClassNameByType(user.getBuyerType());
        System.out.println("对应的策略类为：" + buyerClassName);
        //从容器上下文中获取策略类
        return (Buyer) FrameSpringBeanUtil.getBean(buyerClassName);
    }


}
