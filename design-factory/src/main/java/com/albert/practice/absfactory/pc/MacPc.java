package com.albert.practice.absfactory.pc;

/**
 * @author Albert
 * @date 2020/11/25 下午8:36
 */
public class MacPc implements BasePc {
    public MacPc(){
        this.makePc();
    }
    @Override
    public void makePc() {
        System.out.println("制作苹果电脑");
    }
}
