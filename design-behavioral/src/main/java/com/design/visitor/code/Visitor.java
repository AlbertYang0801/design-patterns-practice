package com.design.visitor.code;

/**
 * @author yangjunwei
 * @date 2024/9/2
 */
public interface Visitor {

    void visit(Book book);

    void visit(Movie movie);


}
