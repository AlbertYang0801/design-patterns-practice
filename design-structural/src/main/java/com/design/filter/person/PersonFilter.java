package com.design.filter.person;

import java.util.List;

/**
 * @author yangjunwei
 * @date 2024/8/23
 */
public interface PersonFilter {

    /**
     * 过滤逻辑
     * @param persons
     * @return
     */
    List<Person> filterOperate(List<Person> persons);


}
