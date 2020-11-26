package com.design.practice.prototype.solved;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Albert
 * @date 2020/11/26 下午5:22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
 class Sheep implements Cloneable {

    private String name;
    private Integer age;
    private String color;

    /**
     * 重写clone()方法,实现对象的克隆
     */
    @Override
    public Sheep clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }


}

/**
 * 实现Cloneable，重写clone()方法。
 * Java中Object是所有类的根类，Object类提供了一个clone()方法，该方法可以将一个java对象复制一份。
 * 需要java类实现接口Cloneable，表示该类拥有复制类的能力。
 */
