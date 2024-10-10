package com.design.memento.code;

import java.util.ArrayList;
import java.util.List;

/**
 * 保存备忘录
 *
 * @author yangjunwei
 * @date 2024/8/30
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }


}
