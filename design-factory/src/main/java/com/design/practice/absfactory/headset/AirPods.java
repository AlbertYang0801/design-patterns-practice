package com.design.practice.absfactory.headset;

/**
 * @author Albert
 * @date 2020/11/25 下午8:57
 */
public class AirPods implements BaseHeadset {

    public AirPods() {
        this.makeHeadSet();
    }

    @Override
    public void makeHeadSet() {
        System.out.println("制作苹果耳机");
    }


}
