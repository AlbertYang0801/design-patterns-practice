package com.design.principle.liskov.unsolved;

/**
 * 里氏替换原则，直接使用继承会产生耦合
 * @author Albert
 * @date 2020/11/8 22:52
 */
public class CountNum {

    public static void main(String[] args) {
        Acount acount = new Acount();
        System.out.println("10+10="+ acount.plus(10,10));

        Bcount bcount = new Bcount();
        bcount.plus(10,10);
        System.out.println("10+10="+ bcount.plus(10,10));

    }


}

class Acount {
    public int plus(int a,int b){
        return a+b;
    }
}

/**
 * B类继承了A类，增加了和A类之间的耦合性
 */
class Bcount extends Acount{

    /**
     * 子类重写了父类方法，增加了继承体系的复杂度
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public int plus(int num1,int num2){
        return num1+num2+10;
    }

}
