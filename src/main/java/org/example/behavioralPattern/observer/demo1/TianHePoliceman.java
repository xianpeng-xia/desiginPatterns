package org.example.behavioralPattern.observer.demo1;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 11:22 下午
 */
public class TianHePoliceman implements Policeman {

    @Override
    public void action(Citizen citizen) {
        String help = citizen.getHelp();
        if ("normal".equals(help)) {
            System.out.println("一切正常，不用出警");
        }
        if ("unnormal".equals(help)) {
            System.out.println("有犯罪行为，天河警察出动");
        }
    }
}
