package org.example.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 11:05 下午
 */
public abstract class Citizen {

    List<Policeman> pols;
    String help = "normal";

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    abstract void sendMessage(String help);

    public void setPolicemen() {
        this.pols = new ArrayList<>();
    }

    public void register(Policeman policeman) {
        this.pols.add(policeman);
    }

    public void unRegister(Policeman policeman) {
        this.pols.remove(policeman);
    }
}
