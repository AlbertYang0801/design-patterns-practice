package com.design.adapter;

/**
 * @author yjw
 * @date 2022/7/27 22:22
 */
public class TranslatorAdapter implements Translator {

    /**
     * 通过注入的方式将待转换的类注入（也可以通过继承）
     */
    private Speaker speaker;

    public TranslatorAdapter(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public String translate() {
        return speaker.speak();
    }

}
