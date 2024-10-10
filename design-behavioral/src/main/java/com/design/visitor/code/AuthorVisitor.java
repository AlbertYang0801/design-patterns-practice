package com.design.visitor.code;

/**
 * @author yangjunwei
 * @date 2024/9/2
 */
public class AuthorVisitor implements Visitor{

    @Override
    public void visit(Book book) {
        System.out.println("访问书籍：" + book.getTitle());
    }

    @Override
    public void visit(Movie movie) {
        System.out.println("访问电影：" + movie.getTitle());
    }


}
