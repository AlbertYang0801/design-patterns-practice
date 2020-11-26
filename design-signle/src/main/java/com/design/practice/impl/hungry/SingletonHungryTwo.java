package com.design.practice.impl.hungry;

/**
 * 饿汉式实现02_静态代码块
 *
 * @author Albert
 * @date 2020/11/23 上午11:01
 */
public class SingletonHungryTwo {

    public SingletonHungryTwo() {
    }

    /**
     * 静态代码块创建对象，在类加载完成之后，静态变量加载之后加载，节省时间，占用内存，以空间换时间
     */
    private final static SingletonHungryTwo INSTANCE;

    static {
        INSTANCE = new SingletonHungryTwo();
    }

    public static SingletonHungryTwo getInstance() {
        return INSTANCE;
    }


}
