package com.design.filter;

import com.design.filter.person.AgeFilter;
import com.design.filter.person.GenderFilter;
import com.design.filter.person.Person;
import com.design.filter.person.PersonFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤模式
 * 按需选择不同的过滤器
 *
 * @author yangjunwei
 * @date 2024/8/23
 */
public class FilterTest {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("程咬金", "男", 36));
        personList.add(new Person("露娜", "女", 16));
        personList.add(new Person("伽啰", "女", 18));
        personList.add(new Person("苏烈", "男", 40));
        personList.add(new Person("武则天", "女", 24));
        personList.add(new Person("韩信", "男", 16));

        //过程出年龄已满18周岁的同学
        PersonFilter ageFilter = new AgeFilter();
        personList = ageFilter.filterOperate(personList);
        System.out.println(personList);
        System.out.println("========分隔符=======");

        //过滤出性别为男的同学
        PersonFilter genderFilter = new GenderFilter();
        personList = genderFilter.filterOperate(personList);
        System.out.println(personList);
    }


}
