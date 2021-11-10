package com.design.factory.absfactory;


import com.design.factory.absfactory.factory.AppleFactory;
import com.design.factory.absfactory.factory.BaseFactory;
import com.design.factory.absfactory.factory.HuaweiFactory;

/**
 * 下订单
 * @author Albert
 * @date 2020/11/26 下午4:30
 */
public class ProductOrder {

    private BaseFactory baseFactory;

    public  ProductOrder(Integer type){
        if(type==0){
            this.baseFactory= new AppleFactory();
        }else{
            this.baseFactory= new HuaweiFactory();
        }

    }

    public void buy(){
        baseFactory.makeHeadset();
        baseFactory.makePc();
        baseFactory.makePhone();
    }


}
