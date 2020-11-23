package com.design.single.other;

/**
 * 静态内部类实现单例模式
 * 推荐使用
 * @author Albert
 * @date 2020/11/23 下午12:01
 */
public class SingletonStatic {

    private SingletonStatic() {
    }

    /**
     * 静态内部类，在外部类被加载的时候不会立即加载。
     * 只有在调用该类里的参数或方法时，才会被加载。达到了懒加载的效果。
     * 在类加载的时候，是线程安全的。达到了线程安全的效果。
     */
    private static class SingletonStaticClass {
        private static final SingletonStatic SINGLETONSTATIC = new SingletonStatic();
    }

    public static SingletonStatic getInstance() {
        return SingletonStaticClass.SINGLETONSTATIC;
    }


}
