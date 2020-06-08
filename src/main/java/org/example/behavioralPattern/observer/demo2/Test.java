package org.example.behavioralPattern.observer.demo2;

/**
 * Created by xianpeng.xia
 * on 2020/6/7 11:36 下午
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexObserver hexObserver = new HexObserver(subject);

        subject.setState(15);
        System.out.println("-----------");
        subject.setState(10);
    }
}
