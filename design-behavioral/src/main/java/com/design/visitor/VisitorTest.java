package com.design.visitor;

import com.design.visitor.code.AuthorVisitor;
import com.design.visitor.code.ObjectStructure;

/**
 * 访问者模式
 *
 * 访问数据结构的方式，通过访问者的方法访问
 * @author yangjunwei
 * @date 2024/9/2
 */
public class VisitorTest {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addBooksAndMovies();

        objectStructure.accept(new AuthorVisitor());
    }


}
