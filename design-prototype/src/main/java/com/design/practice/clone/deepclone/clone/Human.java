package com.design.practice.clone.deepclone.clone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 01_采用克隆实现深拷贝
 *
 * @author Albert
 * @date 2020/11/27 下午5:34
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
 class Human implements Serializable, Cloneable {

    private String name;
    private Integer age;
    private Pet pet;

    @Override
    protected Object clone() {
        Human human = null;
        try {
            human = (Human) super.clone();
            //引用类型单独处理,调用引用类型的克隆方法
            Pet clonePet = (Pet) human.getPet().clone();
            human.setPet(clonePet);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return human;
    }


}
