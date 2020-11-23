package com.design.single.impl.hungry;

/**
 * 饿汉式实现01_静态变量
 *
 * @author Albert
 * @date 2020/11/23 上午10:53
 */
public class SingletonHungryOne {

    public SingletonHungryOne() {
    }

    /**
     * 类加载时创建对象，节省时间，占用内存，以空间换时间
     */
    private final static SingletonHungryOne INSTANCE = new SingletonHungryOne();

    public static SingletonHungryOne getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        SingletonHungryOne instanceOne = SingletonHungryOne.getInstance();
        SingletonHungryOne instanceTwo = SingletonHungryOne.getInstance();
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
        System.out.println(instanceOne.equals(instanceTwo));
    }


}
