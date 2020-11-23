package com.design.single.lazy;

import java.util.Objects;

/**
 * 懒汉式实现04_双重检查
 * 同步代码块双重检查
 *
 * @author Albert
 * @date 2020/11/23 上午11:06
 */
public class SingletonLazyFour {

    public SingletonLazyFour() {
    }

    /**
     * 使用volatile防止多线程环境下出现指令重排问题的发生。
     */
    private volatile static SingletonLazyFour INSTANCE;

    /**
     * 双重检查锁
     */
    public static SingletonLazyFour getInstance() {
        //第一次检查
        if (Objects.isNull(INSTANCE)) {
            //同步代码块
            synchronized (SingletonLazyFour.class){
                //同步代码块内部检查
                if(Objects.isNull(INSTANCE)){
                    INSTANCE = new SingletonLazyFour();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println("懒汉式双重检查锁");
        SingletonLazyFour instanceOne = SingletonLazyFour.getInstance();
        SingletonLazyFour instanceTwo = SingletonLazyFour.getInstance();
        System.out.println(instanceOne.equals(instanceTwo));
    }


}

/**
 * 特点：懒加载，以时间换空间，解决了线程安全问题，效率较高。
 * 同步代码块比同步方法效率高。
 * 使用双重检查解决了同步代码块可能创建多个实例的可能。保证了单个实例的创建。
 * 实际开发中，推荐这种方式
 */