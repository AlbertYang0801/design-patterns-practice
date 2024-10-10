package com.design.memento.code;

/**
 * @author yangjunwei
 * @date 2024/8/30
 */
public class Originator {

    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    /**
     * 保存状态到备忘录
     * @return
     */
    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    /**
     * 获取备忘录中的值
     * @param Memento
     */
    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }


}
