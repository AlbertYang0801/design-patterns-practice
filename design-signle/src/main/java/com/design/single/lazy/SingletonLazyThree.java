package com.design.single.lazy;

import java.util.Objects;

/**
 * 懒汉式实现03_同步代码块
 *
 * @author Albert
 * @date 2020/11/23 上午11:06
 */
public class SingletonLazyThree {

    public SingletonLazyThree() {
    }

    private static SingletonLazyThree INSTANCE;

    /**
     * 懒加载，对象为空时则创建，以时间换空间
     */
    public static  SingletonLazyThree getInstance() {
        if (Objects.isNull(INSTANCE)) {
            //同步代码块
            synchronized (SingletonLazyThree.class){
                INSTANCE = new SingletonLazyThree();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        SingletonLazyThree instanceOne = SingletonLazyThree.getInstance();
        SingletonLazyThree instanceTwo = SingletonLazyThree.getInstance();
        System.out.println(instanceOne.equals(instanceTwo));
    }


}

/**
 * 特点：懒加载，以时间换空间。
 * 由于方法级别同步效率低下，使用同步代码块提高效率，并解决线程安全问题。
 * 但是实际并没有解决线程安全问题，和普通饿汉式一样，在多线程环境下，可能会有多个线程进入if (Objects.isNull(INSTANCE)) ，从而创建出多个实例。
 * 实际开发中，不推荐使用这种方式。
 */