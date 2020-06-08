package org.example.behavioralPattern.observer.demo1;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 11:15 下午
 */
public class TianHeCitizen extends Citizen {

    public TianHeCitizen(Policeman policeman) {
        setPolicemen();
        register(policeman);
    }

    @Override
    void sendMessage(String help) {
        setHelp(help);
        for (int i = 0; i < pols.size(); i++) {
            Policeman policeman = pols.get(i);
            policeman.action(this);
        }
    }
}
