package org.example.structuralPattern.adapter.demo2;

/**
 * @date 2020/06/08
 * @time 15:52
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("play vlc file,name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
