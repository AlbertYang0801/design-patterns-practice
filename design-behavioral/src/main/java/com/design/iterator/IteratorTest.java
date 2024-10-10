package com.design.iterator;

import com.design.iterator.iterator.Iterator;
import com.design.iterator.iterator.NameRepository;

import javax.naming.Name;

/**
 * 迭代器模式
 *
 * @author yangjunwei
 * @date 2024/8/30
 */
public class IteratorTest {

    public static void main(String[] args) {
        NameRepository repository = new NameRepository();
        Iterator<String> iterator = repository.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
