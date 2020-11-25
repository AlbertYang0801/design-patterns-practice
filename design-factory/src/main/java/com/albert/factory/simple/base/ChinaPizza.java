package com.albert.factory.simple.base;

/**
 * 中国披萨
 * @author Albert
 * @date 2020/11/25 下午3:36
 */
public class ChinaPizza extends BasePizzaMake {

    @Override
    public void prepare() {
        System.out.println("中国披萨:开始准备材料");
    }

    @Override
    public void bake() {
        System.out.println("中国披萨:烤");
    }

    @Override
    public void cut() {
        System.out.println("中国披萨:切");
    }

    @Override
    public void box() {
        System.out.println("中国披萨:装盒子");
    }


}
