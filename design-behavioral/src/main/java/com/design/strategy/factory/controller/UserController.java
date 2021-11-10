package com.design.strategy.factory.controller;

import com.design.strategy.factory.service.CashierService;
import com.design.strategy.factory.vo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author yjw
 * @date 2021/1/20 22:15
 */
@RestController
public class UserController {

    @GetMapping("/buyer")
    public void buyer(){
        User user = User.builder()
                .buyerType(1)
                .name("小明")
                .build();
        //定义上下文
        CashierService cashierService = new CashierService();
        BigDecimal quote = cashierService.quote(user, new BigDecimal(300));
        System.out.println("普通会员的优惠价格为:" + quote);
    }


}
