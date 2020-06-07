package org.example.behaviouralPattern.observer.demo1;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 11:12 下午
 */
public class HuangPuCitizen extends Citizen {

    public HuangPuCitizen(Policeman policeman) {
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
