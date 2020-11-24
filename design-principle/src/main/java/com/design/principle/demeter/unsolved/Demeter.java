package com.design.principle.demeter.unsolved;

import com.design.principle.demeter.unsolved.service.CollegeManager;
import com.design.principle.demeter.unsolved.service.SchoolManager;

/**
 * 违反迪米特法则
 * 需求：获取学院人员信息和学校总部人员信息
 * @author Albert
 * @date 2020/11/24 下午5:40
 */
public class Demeter {

    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        CollegeManager collegeManager = new CollegeManager();
        schoolManager.printSchoolAllEmployee(collegeManager);
    }


}
