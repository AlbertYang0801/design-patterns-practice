package com.design.single.problem.serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * 序列化练习-transient关键字
 * 该关键字可指定对应属性不进行序列化
 *
 * @author Albert
 * @date 2020/11/23 下午6:17
 */
public class TransientPractice {

    private static final String FILE_PATH = "/Users/yangjunwei/IdeaProjects/design-patterns-practice/design-signle/src/main/resources/file/student.txt";

    private static void writeFile(Student student) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            objectOutputStream.writeObject(student);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Student readFile() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
            Student student = (Student) objectInputStream.readObject();
            objectInputStream.close();
            return student;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Student oldStudent = Student.builder()
                .name("测试transient关键字序列化")
                .pwd("123456")
                .build();
        System.out.println("序列化之前的数据为:"+oldStudent);
        TransientPractice.writeFile(oldStudent);
        Student newStudent = TransientPractice.readFile();
        System.out.println("序列化之后的数据为:"+newStudent);
    }


}


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Student implements Serializable {
    private String name;
    /**
     * 不将pwd属性进行序列化
     */
    private transient String pwd;

}