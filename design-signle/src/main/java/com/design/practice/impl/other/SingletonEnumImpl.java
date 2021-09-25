package com.design.practice.impl.other;

/**
 * 枚举类实现单例模式
 * 推荐使用
 *
 * @author Albert
 * @date 2020/11/23 下午5:31
 */
public class SingletonEnumImpl {


    /**
     * 每一个枚举类型及其定义的枚举变量在JVM中都是唯一的特性，保证了枚举对象的唯一性。
     */

    private enum SingletonEnum {
        /**
         * 唯一实例
         */
        INSTNACE;

        private SingletonEnumImpl singletonEnumImpl;

        private SingletonEnum() {
            singletonEnumImpl = new SingletonEnumImpl();
        }

        private SingletonEnumImpl getSingletonEnumImpl() {
            return singletonEnumImpl;
        }

    }

    public static SingletonEnumImpl getInstance() {
        return SingletonEnum.INSTNACE.getSingletonEnumImpl();
    }

    public static void main(String[] args) {
        SingletonEnumImpl instanceOne = SingletonEnumImpl.getInstance();
        SingletonEnumImpl instanceTwo = SingletonEnumImpl.getInstance();
        System.out.println(instanceOne == instanceTwo);
    }


}

