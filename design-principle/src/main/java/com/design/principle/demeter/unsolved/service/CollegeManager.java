package com.design.principle.demeter.unsolved.service;

import com.design.principle.demeter.unsolved.vo.CollegeEmployee;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.UUID;

/**
 * 学院管理类
 * @author Albert
 * @date 2020/11/24 下午5:34
 */
public class CollegeManager {

    /**
     * 获取学院员工列表
     */
    public List<CollegeEmployee> getCollegeEmployeeList(){
        List<CollegeEmployee> collegeEmployeeList= Lists.newArrayList();

        for(int i=0;i<10;i++){
            CollegeEmployee collegeEmployee = CollegeEmployee.builder()
                    .id(UUID.randomUUID().toString())
                    .build();
            collegeEmployeeList.add(collegeEmployee);
        }
        return collegeEmployeeList;
    }


}
