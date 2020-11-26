package com.design.practice.prototype.unsolved;

/**
 * 创建一个sheep对象，复制出10个相同对象
 * 通过初始化对象的方式获取一个新的对象，若对象比较复杂，则效率低下。
 * @author Albert
 * @date 2020/11/26 下午5:21
 */
public class SheepClient {

    public static void cloneSheep(Sheep sheep){
        for(int i=0;i<10;i++){
            //重新创建对象实现对象的复制
            Sheep sheepNum = Sheep.builder()
                    .name(sheep.getName())
                    .age(sheep.getAge())
                    .color(sheep.getColor())
                    .build();
            System.out.println(sheepNum);
        }
    }

    public static void main(String[] args) {
        Sheep sheep = Sheep.builder()
                .name("小莉")
                .age(10)
                .color("白色")
                .build();
        //克隆10只属性一致的羊
        SheepClient.cloneSheep(sheep);
    }


}
