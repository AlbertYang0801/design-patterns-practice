package com.design.practice.serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * 序列化练习
 * @author Albert
 * @date 2020/11/23 下午6:00
 */
public class UserSerializable {

    private static final String FILE_PATH = "/Users/yangjunwei/IdeaProjects/design-patterns-practice/design-signle/src/main/resources/file/user.txt";

    private static void writeFile(User user){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            //将对象写入输出流
            objectOutputStream.writeObject(user);
            //刷新流
            objectOutputStream.flush();
            //关闭输出流
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static User readFile(){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
            User user = (User)objectInputStream.readObject();
            objectInputStream.close();
            return user;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        User oldUser = User.builder().name("测试序列化数据").pwd("161455").build();
        System.out.println("------------开始写入------------");
        System.out.println("写入文件之前的对象userName："+oldUser.getName());
        System.out.println("写入文件之前的对象pwd："+oldUser.getPwd());
        //开始写入文件
        UserSerializable.writeFile(oldUser);
        //从文件中获取对象
        System.out.println("------------开始获取------------");
        User readUser = UserSerializable.readFile();
        System.out.println("从文件中获取的对象userName："+readUser.getName());
        System.out.println("从文件中获取的对象pwd："+readUser.getPwd());
        System.out.println("------------比较对象------------");
        System.out.println("写入文件之前的对象为:"+oldUser);
        System.out.println("从文件读取的对象为:"+readUser);
        System.out.println("反序列化后的对象是否和原来的对象一致:"+(oldUser==readUser));
    }


}



@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class User implements Serializable{
    private String name;
    private String pwd;

}
