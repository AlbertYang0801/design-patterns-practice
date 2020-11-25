package com.albert.practice.absfactory.pc;

/**
 * @author Albert
 * @date 2020/11/25 下午8:36
 */
public class HuaweiPc implements BasePc {
    public HuaweiPc(){
        this.makePc();
    }
    @Override
    public void makePc() {
        System.out.println("制作华为电脑");
    }
}
