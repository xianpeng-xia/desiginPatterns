package org.example.creationalPattern.abstractProduct;

/**
 * Created by xianpeng.xia
 * on 2019/12/20 9:59 下午
 */
public interface IAnimalFactory {

    ICat createCat();

    IDog createDog();
}
