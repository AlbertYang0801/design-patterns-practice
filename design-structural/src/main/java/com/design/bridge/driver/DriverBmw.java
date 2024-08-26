package com.design.bridge.driver;

import com.design.bridge.sing.Song;

/**
 * @author yangjunwei
 * @date 2024/8/22
 */
public class DriverBmw extends DriverAbstract {

    /**
     * 通过组合方式集成
     *
     * @param song 以组合形式集成另一个行为
     */
    public DriverBmw(String name, Song song) {
        super(name, song);
    }

    @Override
    public void driver() {
        System.out.println("开着" + name + " 唱" + song.sing());
    }

}
