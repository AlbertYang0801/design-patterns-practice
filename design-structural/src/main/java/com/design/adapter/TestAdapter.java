package com.design.adapter;

/**
 * @author yjw
 * @date 2022/7/27 22:23
 */
public class TestAdapter {

    public static void main(String[] args) {
        //通过adapter对speaker类进行适配
        String translate = new TranslatorAdapter(new Speaker()).translate();
        System.out.println(translate);
    }


}
