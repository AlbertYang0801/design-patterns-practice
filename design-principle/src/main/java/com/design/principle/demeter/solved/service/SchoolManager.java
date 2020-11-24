package com.design.principle.demeter.solved.service;

import com.albert.utils.jackson.JsonUtil;
import com.design.principle.demeter.solved.vo.CollegeEmployee;
import com.design.principle.demeter.solved.vo.SchoolEmployee;
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
        System.out.println("学校总部人员的信息为:"+JsonUtil.toString(schoolEmployeeList));
        //打印学院人员信息，不和CollegeEmployee类产生耦合
        collegeManager.printCollegeEmployee();
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
 * 解决办法：
 * CollegeEmployee不要作为局部变量出现在当前类，将打印的方法放到已经和CollegeEmployee有依赖的CollegeManager类
 */
