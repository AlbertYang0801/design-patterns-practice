package com.design.signle.unchange;

/**
 * @author yjw
 * @date 2021/9/25 22:41
 */
public final class Product {

    private final String no;
    private final String name;
    private final double price;

    public Product(String no,String name,double price){
        super();
        this.no=no;
        this.name=name;
        this.price=price;
    }

    public String getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
