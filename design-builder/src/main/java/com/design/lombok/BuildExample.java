package com.design.lombok;

/**
 * 实现对象的链式调用
 * 但是未将产品类和具体建造者类解耦合
 *
 * @author Albert
 * @date 2020/12/29 下午2:40
 */
public class BuildExample {

    private String id;
    private String name;
    private int age;

    public BuildExample() {
    }

    public BuildExample(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static BuildExample builder() {
        return new BuildExample();
    }

    public BuildExample build() {
        return new BuildExample(this.id, this.name, this.age);
    }

    public BuildExample id(String id) {
        this.id = id;
        return this;
    }

    public BuildExample name(String name) {
        this.name = name;
        return this;
    }

    public BuildExample age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "BuildExample{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        BuildExample buildExample = BuildExample.builder()
                .id("123")
                .name("test")
                .age(110)
                .build();
        System.out.println(buildExample);
    }


}
