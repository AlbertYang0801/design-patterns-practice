package com.design.filter.person;

import cn.hutool.core.collection.CollUtil;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yangjunwei
 * @date 2024/8/23
 */
public class AgeFilter implements PersonFilter {

    @Override
    public List<Person> filterOperate(List<Person> persons) {
        //过滤大于18岁的
        return CollUtil.emptyIfNull(persons).stream().filter(p->p.getAge()>=18).collect(Collectors.toList());
    }


}
