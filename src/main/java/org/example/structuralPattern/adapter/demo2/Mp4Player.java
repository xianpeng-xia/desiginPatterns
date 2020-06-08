package org.example.structuralPattern.adapter.demo2;

/**
 * @date 2020/06/08
 * @time 15:52
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("play mp4 file,name: " + fileName);
    }
}
