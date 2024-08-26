package com.design.bridge.driver;

import com.design.bridge.sing.Song;

/**
 * 一个类存在两个变化维度，第一个纬度开车
 *
 * @author yangjunwei
 * @date 2024/8/22
 */
public abstract class DriverAbstract {

    protected Song song;

    protected String name;

    /**
     * 通过组合方式集成
     * @param song
     */
    public DriverAbstract(String name, Song song) {
        this.name = name;
        this.song = song;
    }

    /**
     * 开车
     */
    public  abstract void driver();

    void sing() {
        song.sing();
    }


}
