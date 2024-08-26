package com.design.filter.person;

import cn.hutool.core.collection.CollUtil;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yangjunwei
 * @date 2024/8/23
 */
public class GenderFilter implements PersonFilter{

    @Override
    public List<Person> filterOperate(List<Person> persons) {
        //过滤男性
        return CollUtil.emptyIfNull(persons).stream().filter(p->p.getGender().equals("男")).collect(Collectors.toList());
    }


}
