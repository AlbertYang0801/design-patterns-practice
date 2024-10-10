package com.design.visitor.code;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据结构，保存访问者需要访问的元素
 * @author yangjunwei
 * @date 2024/9/2
 */
public class ObjectStructure {

    private List<Element> elements = new ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }

    public void accept(Visitor visitor){
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

    public void addBooksAndMovies(){
        addElement(new Book("Java"));
        addElement(new Book("设计模式"));
        addElement(new Movie("举起手来"));
    }



}
