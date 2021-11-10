package com.design.prototype.prototype.solved;

/**
 * 创建一个sheep对象，复制出10个相同对象
 * 使用原型模式的克隆方式，进行新对象的创建
 * @author Albert
 * @date 2020/11/26 下午8:24
 */
public class SheepClient {

    public static void cloneSheep(Sheep sheep) {
        for (int i = 0; i < 10; i++) {
            //使用原型模式，拷贝对象
            Sheep cloneSheep = sheep.clone();
            System.out.println(cloneSheep);
        }
    }

    public static void main(String[] args) {
        System.out.println("使用原型模式进行对象的克隆");
        Sheep sheep = Sheep.builder()
                .name("小莉")
                .age(10)
                .color("白色")
                .build();
        SheepClient.cloneSheep(sheep);
    }


}
