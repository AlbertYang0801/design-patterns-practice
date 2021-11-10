package com.design.prototype.clone.deepclone.serializ;

/**
 * @author Albert
 * @date 2020/11/27 下午5:39
 */
class HumanClient {

    public static void main(String[] args) {
        Pet pet = Pet.builder()
                .color("红色")
                .petName("小兔子")
                .build();
        Human human = Human.builder()
                .age(10)
                .name("小红")
                .pet(pet)
                .build();
        Human cloneHuman = (Human) human.clone();
        //深拷贝后的引用类型属性一致，但是地址值不一致
        System.out.println(human.getPet().hashCode());
        System.out.println(cloneHuman.getPet().hashCode());
        System.out.println(cloneHuman.getPet()==human.getPet());
    }


}
