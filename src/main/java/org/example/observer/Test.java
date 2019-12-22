package org.example.observer;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 11:24 下午
 */
public class Test {

    public static void main(String[] args) {
        Policeman tianHePoliceman = new TianHePoliceman();
        Policeman huangPuPoliceman = new HuangPuPoliceman();

        Citizen citizen = new HuangPuCitizen(huangPuPoliceman);
        citizen.sendMessage("unnormal");
        citizen.sendMessage("normal");

        System.out.println("===============");

        citizen = new TianHeCitizen(tianHePoliceman);
        citizen.sendMessage("normal");
        citizen.sendMessage("unnormal");
    }
}
