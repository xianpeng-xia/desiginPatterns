package org.example.structuralPattern.adapter.demo2;

/**
 * @date 2020/06/08
 * @time 15:59
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String autoType, String fileName) {
        if (autoType.equalsIgnoreCase("mp3")) {
            System.out.println("play mp3 file,name: " + fileName);
        } else if (autoType.equalsIgnoreCase("vlc") || autoType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(autoType);
            mediaAdapter.play(autoType, fileName);
        } else {
            System.out.println("Invalid media . " + autoType + " format not support");
        }
    }
}
