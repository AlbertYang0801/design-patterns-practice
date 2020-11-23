package com.design.single.lazy;

import java.util.Objects;

/**
 * 懒汉式实现01_线程不安全
 *
 * @author Albert
 * @date 2020/11/23 上午11:06
 */
public class SingletonLazyOne {

    public SingletonLazyOne() {
    }

    private static SingletonLazyOne INSTANCE;

    /**
     * 懒加载，对象为空时则创建，以时间换空间
     */
    public static SingletonLazyOne getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new SingletonLazyOne();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        SingletonLazyOne instanceOne = SingletonLazyOne.getInstance();
        SingletonLazyOne instanceTwo = SingletonLazyOne.getInstance();
        System.out.println(instanceOne.equals(instanceTwo));
    }


}

/**
 * 特点：懒加载，以时间换空间，只能在单线程情况使用。
 * 若在多线程情况下，一个线程进入了 if (Objects.isNull(INSTANCE)) 里时，另一个线程也进入。可能会导致多个实例的产生。
 * 多线程环境不可以使用该方式。
 * 实际开发中，不推荐使用这种方式。
 */