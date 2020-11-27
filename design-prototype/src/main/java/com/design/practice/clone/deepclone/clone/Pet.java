package com.design.practice.clone.deepclone.clone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 01_采用克隆实现深拷贝
 * 宠物类，为其他类的引用类型属性
 * @author Albert
 * @date 2020/11/27 下午5:34
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
 class Pet implements Serializable,Cloneable {

    private String petName;
    private String color;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
