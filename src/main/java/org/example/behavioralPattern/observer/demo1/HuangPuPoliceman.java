package org.example.behavioralPattern.observer.demo1;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 11:18 下午
 */
public class HuangPuPoliceman implements Policeman {

    @Override
    public void action(Citizen citizen) {
        String help = citizen.getHelp();
        if ("normal".equals(help)) {
            System.out.println("一切正常，不用出警");
        }

        if("unnormal".equals(help)){
            System.out.println("有犯罪行为，黄埔警察出动");
        }
    }
}
