package com.design.principle.composite;

/**
 * 聚合关系
 * 另一个类包含在当前类中，但另一个类不是当前类的组成部分，另一个类不会因为当前类的创建和销毁而去创建和销毁。
 * 人和电脑就是一种聚合关系。
 * @author Albert
 * @date 2020/11/24 下午6:19
 */
public class PersonCpmputer {

    private Computer computer;

    public void setComputer(Computer c){
        this.computer= c;
    }

    public void play(){
        computer.play();
    }

    public static void main(String[] args) {
        PersonCpmputer personCpmputer=new PersonCpmputer();
        //赋值另一个类
        personCpmputer.setComputer(new Computer());
        personCpmputer.play();
    }


}

class Computer{

    public void play(){
        System.out.println("玩电脑！");
    }


}
