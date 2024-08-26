package com.design.principle.demeter.solved.service;

import cn.hutool.json.JSONUtil;
import com.design.principle.demeter.solved.vo.CollegeEmployee;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.UUID;

/**
 * 学院管理类
 *
 * @author Albert
 * @date 2020/11/24 下午5:34
 */
public class CollegeManager {

    /**
     * 获取学院员工列表
     */
    public List<CollegeEmployee> getCollegeEmployeeList() {
        List<CollegeEmployee> collegeEmployeeList = Lists.newArrayList();

        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = CollegeEmployee.builder()
                    .id(UUID.randomUUID().toString())
                    .build();
            collegeEmployeeList.add(collegeEmployee);
        }
        return collegeEmployeeList;
    }

    public void printCollegeEmployee() {
        List<CollegeEmployee> collegeEmployeeList = this.getCollegeEmployeeList();
        System.out.println("学院人员的信息为:" + JSONUtil.toJsonStr(collegeEmployeeList));
    }


}

/**
 * CollegeManager的直接朋友有CollegeEmployee
 */