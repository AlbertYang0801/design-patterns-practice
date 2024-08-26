package com.design.bridge.driver;

import com.design.bridge.sing.Song;

/**
 * @author yangjunwei
 * @date 2024/8/22
 */
public class DriverTesla extends DriverAbstract {

    /**
     * 通过组合方式集成
     *
     * @param song
     */
    public DriverTesla(String name, Song song) {
        super(name, song);
    }

    @Override
    public void driver() {
        System.out.println("开着" + name + " 唱" + song.sing());
    }

}
