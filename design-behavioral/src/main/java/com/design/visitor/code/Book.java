package com.design.visitor.code;

/**
 * @author yangjunwei
 * @date 2024/9/2
 */
public class Book implements Element {

    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getTitle() {
        return title;
    }


}
