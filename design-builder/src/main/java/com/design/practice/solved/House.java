package com.design.practice.solved;

/**
 * 建造者模式四大角色之-产品角色
 * @author Albert
 * @date 2021/1/6 上午11:44
 */
public class House {

    private String baise;
    private String wall;
    private String roofed;

    public House(String baise, String wall, String roofed) {
        this.baise = baise;
        this.wall = wall;
        this.roofed = roofed;
    }

    public House() {
    }

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    @Override
    public String toString() {
        return "House{" +
                "baise='" + baise + '\'' +
                ", wall='" + wall + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }


}
