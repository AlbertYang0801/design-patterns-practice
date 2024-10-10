package com.design.memento.code;

/**
 * 备忘录
 * @author yangjunwei
 * @date 2024/8/30
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

}
