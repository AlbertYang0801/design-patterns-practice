package com.albert.practice.absfactory.headset;

/**
 * @author Albert
 * @date 2020/11/25 下午8:58
 */
public class FreeBuds implements BaseHeadset{
    public FreeBuds(){
        this.makeHeadSet();
    }
    @Override
    public void makeHeadSet() {
        System.out.println("制作华为耳机");
    }
}
