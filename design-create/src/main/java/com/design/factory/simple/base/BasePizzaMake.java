package com.design.factory.simple.base;

/**
 * 披萨的抽象类
 * @author Albert
 * @date 2020/11/25 下午3:34
 */
public abstract class BasePizzaMake {

    /**
     * 准备材料
     */
    public abstract void prepare();

    /**
     * 开始烤
     */
    public abstract void bake();

    /**
     * 切
     */
    public abstract void cut();

    /**
     * 装盒子
     */
    public abstract void box();


}
