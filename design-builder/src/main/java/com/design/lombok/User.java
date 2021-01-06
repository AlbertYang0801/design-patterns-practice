package com.design.lombok;

/**
 * 实现lombok的@builder注解，建造者模式功能
 * 实现链式调用
 *
 * @author Albert
 * @date 2020/12/29 上午11:37
 */
public class User {

    private String id;
    private String name;
    private int age;

    /**
     * 产品类的有参构造
     */
    public User(final String id, final String name, final int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * 创建一个建造者
     */
    public static User.UserExampleBuilder builder() {
        return new User.UserExampleBuilder();
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 产品的具体建造者类
     */
    public static class UserExampleBuilder {

        private String id;
        private String name;
        private int age;

        public User.UserExampleBuilder id(final String id) {
            this.id = id;
            return this;
        }

        public User.UserExampleBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public User.UserExampleBuilder age(final int age) {
            this.age = age;
            return this;
        }

        /**
         * 建造者提供的完成建造方法
         * @return
         */
        public User build() {
            return new User(this.id, this.name, this.age);
        }

        @Override
        public String toString() {
            return "UserExampleBuilder{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }


    }

    public static void main(String[] args) {
        User user = User.builder().id("123").name("test").age(12).build();
        System.out.println(user);
    }


}


/**
 * 本类将产品类user和具体建造者类UserExampleBuilder分开，解耦合。
 */