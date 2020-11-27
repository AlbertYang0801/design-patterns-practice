package com.design.practice.clone.deepclone.serializ;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * 02_采用序列化实现深拷贝
 *
 * @author Albert
 * @date 2020/11/27 下午5:34
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Human implements Serializable, Cloneable {

    private String name;
    private Integer age;
    private Pet pet;

    @Override
    protected Object clone() {
        Human human = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream obs = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            obs = new ObjectOutputStream(bos);
            obs.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            human = (Human) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭流对象
                bos.close();
                obs.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return human;
    }


}
