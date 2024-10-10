package com.design.visitor.code;

/**
 * 接受访问者的元素
 * @author yangjunwei
 * @date 2024/9/2
 */
public interface Element {

    void accept(Visitor visitor);


}
