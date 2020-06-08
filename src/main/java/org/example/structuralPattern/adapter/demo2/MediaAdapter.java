package org.example.structuralPattern.adapter.demo2;

/**
 * @date 2020/06/08
 * @time 15:55
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String autoType) {
        if (autoType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String autoType, String fileName) {
        if (autoType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
