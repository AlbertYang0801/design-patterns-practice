package com.design.single.other;

/**
 * 枚举类实现单例模式
 * 推荐使用
 * @author Albert
 * @date 2020/11/23 下午5:31
 */
public class SingletonEnum {

    public static void main(String[] args) {
        Singleton instnaceOne = Singleton.INSTNACE;
        Singleton instnaceTwo = Singleton.INSTNACE;
        //枚举类保证了实例的唯一性
        System.out.println(instnaceOne.hashCode());
        System.out.println(instnaceTwo.hashCode());
        //调用枚举类进行功能实现
        Singleton.INSTNACE.dowork();
    }


}


enum Singleton {
    /**
     * 唯一实例
     */
    INSTNACE;

    /**
     * 功能实现
     */
    public void dowork() {
        System.out.println("doSomething");
    }


}
