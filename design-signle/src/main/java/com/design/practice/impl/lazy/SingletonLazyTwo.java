package com.design.practice.impl.lazy;

import java.util.Objects;

/**
 * 懒汉式实现02_同步方法
 *
 * @author Albert
 * @date 2020/11/23 上午11:06
 */
public class SingletonLazyTwo {

    public SingletonLazyTwo() {
    }

    private static SingletonLazyTwo INSTANCE;

    /**
     * 懒加载，对象为空时则创建，以时间换空间
     * 方法同步，保证线程安全，但是效率低下
     */
    public static synchronized SingletonLazyTwo getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new SingletonLazyTwo();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        SingletonLazyTwo instanceOne = SingletonLazyTwo.getInstance();
        SingletonLazyTwo instanceTwo = SingletonLazyTwo.getInstance();
        System.out.println(instanceOne.equals(instanceTwo));
    }


}

/**
 * 特点：懒加载，以时间换空间，解决了线程安全问题。
 * 效率低下，每个线程获取该类实例时，调用方法都要进行同步。方法级别的同步效率太低。
 * 实际开发中，不推荐使用这种方式。
 */