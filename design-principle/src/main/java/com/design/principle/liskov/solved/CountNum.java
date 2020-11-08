package com.design.principle.liskov.solved;

/**
 * 里氏替换原则
 * 解决继承产生的耦合性，减少继承关系中的方法重写
 * @author Albert
 * @date 2020/11/8 22:52
 */
public class CountNum {

    public static void main(String[] args) {
        Acount acount = new Acount();
        System.out.println("10+10="+ acount.plus(10,10));

        Bcount bcount = new Bcount();
        //调用B类的减法方法
        System.out.println("20-10="+ bcount.less(20,10));
    }


}

/**
 * 创建一个基类，提供基础方法，供子类继承
 */
class BaseCount{
    public int plus(int a,int b){
        return 0;
    }

}

class Acount extends BaseCount{

    /**
     * 重写基类的相加方法
     */
    @Override
    public int plus(int a,int b){
        return a+b;
    }

    /**
     * A类特有的方法，减法
     */
    public int less(int a,int b){
        return a-b;
    }

}

/**
 * 继承基类，组合A类，来拥有A类中特有的方法
 */
class Bcount extends BaseCount{

    /**
     * 子类重写了父类方法，增加了继承体系的复杂度
     */
    @Override
    public int plus(int num1,int num2){
        return num1+num2+10;
    }

    public Acount acount = new Acount();

    /**
     * 组合A类的减法，使B类也拥有减法功能
     */
    public int less(int a,int b){
        return acount.less(a,b);
    }


}
