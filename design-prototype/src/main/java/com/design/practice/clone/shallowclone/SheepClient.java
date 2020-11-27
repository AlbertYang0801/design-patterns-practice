package com.design.practice.clone.shallowclone;


/**
 * 浅拷贝
 * @author Albert
 * @date 2020/11/26 下午8:49
 */
public class SheepClient {

    public static void main(String[] args) {
        Sheep sheepFirend = Sheep.builder()
                .name("小黑")
                .age(20)
                .color("黑色")
                .build();

        Sheep sheep = Sheep.builder()
                .name("小莉")
                .age(10)
                .color("白色")
                .firend(sheepFirend)
                .build();

        //进行对象的克隆
        Sheep cloneSheep = sheep.clone();
        Sheep cloneSheep2 = sheep.clone();

        //原型模式创建的对象，不相等。为新创建的对象
        System.out.println(cloneSheep==cloneSheep2);

        //判断克隆出的多个对象的引用对象的hashcode值，表示对象内容一致
        System.out.println(cloneSheep.getFirend().hashCode());
        System.out.println(cloneSheep2.getFirend().hashCode());

        //克隆对象里的引用类型属性，在生成新对象的时候，复制的是引用类型的地址，故新创建的对象里引用类型属性是相等的。
        System.out.println(cloneSheep.getFirend()==cloneSheep2.getFirend());
    }


}
