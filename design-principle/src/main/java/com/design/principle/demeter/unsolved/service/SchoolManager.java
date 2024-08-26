package com.design.principle.demeter.unsolved.service;

import cn.hutool.json.JSONUtil;
import com.design.principle.demeter.unsolved.vo.CollegeEmployee;
import com.design.principle.demeter.unsolved.vo.SchoolEmployee;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.UUID;

/**
 * 学校管理类
 * @author Albert
 * @date 2020/11/24 下午5:34
 */
public class SchoolManager {

    public void printSchoolAllEmployee(CollegeManager collegeManager){
        //获取学校总部人员信息
        List<SchoolEmployee> schoolEmployeeList = this.getSchoolEmployeeList();
        System.out.println("学校总部人员的信息为:"+ JSONUtil.toJsonStr(schoolEmployeeList));
        //获取学院的人员信息
        //CollegeEmployee作为局部变量，不是当前类的直接朋友，违反了迪米特原则(产生了非直接朋友的耦合)
        List<CollegeEmployee> collegeEmployeeList = collegeManager.getCollegeEmployeeList();
        System.out.println("学院人员的信息为:"+JSONUtil.toJsonStr(collegeEmployeeList));
    }

    /**
     * 获取学校总部人员列表
     */
    private List<SchoolEmployee> getSchoolEmployeeList(){
        List<SchoolEmployee> schoolEmployeeList= Lists.newArrayList();
        for(int i=0;i<10;i++){
            SchoolEmployee schoolEmployee = SchoolEmployee.builder()
                    .id(UUID.randomUUID().toString())
                    .build();
            schoolEmployeeList.add(schoolEmployee);
        }
        return schoolEmployeeList;
    }


}

/**
 * 分析：
 * 当前类SchoolManager的直接朋友有CollegeManager和SchoolEmployee
 * CollegeEmployee作为局部变量出现在类SchoolManager，产生了非直接朋友的耦合，违反了迪米特法则。
 */
