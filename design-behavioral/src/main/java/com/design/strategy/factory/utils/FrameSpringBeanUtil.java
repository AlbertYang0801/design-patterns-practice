package com.design.strategy.factory.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 获取容器内的Bean
 * 解决：线程类中无法获取容器中的Bean
 * @author Albert
 * @date 2020/12/18 下午5:44
 */
@Component
public class FrameSpringBeanUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext app) throws BeansException {
       applicationContext = app;
    }

    /**
     * 根据类名字符串从容器中获取实例对象
     * @param name 类名，首字母小写
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) {
        return (T) applicationContext.getBean(name);
    }

    /**
     * 根据类名从容其中获取类
     */
    public static <T> T getBean(Class<T> cls) {
        return applicationContext.getBean(cls);
    }


}
