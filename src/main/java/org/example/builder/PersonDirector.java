package org.example.builder;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 2:22 下午
 */
public class PersonDirector {

    public Person constructPerson(PersionBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
