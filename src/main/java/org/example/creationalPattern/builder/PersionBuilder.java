package org.example.creationalPattern.builder;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 2:13 下午
 */
public interface PersionBuilder {

    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
