package com.design.principle.composite;

/**
 * 组合关系
 * 另一个类随着当前类创建和销毁。
 * 人和手的关系就是组合关系
 * @author Albert
 * @date 2020/11/24 下午6:15
 */
public class PersonHand {

    /**
     * 该类为当前类一部分，Person类创建Head类也创建。
     */
    private final Hand hand= new Hand();

    public void personHeadOut(){
        //握手
        hand.handOut();;
    }

    public static void main(String[] args) {
        PersonHand person = new PersonHand();
        person.personHeadOut();
    }


}


class Hand{

    public void handOut(){
        System.out.println("握手!");
    }


}
