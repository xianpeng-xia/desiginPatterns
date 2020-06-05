package org.example.creationalPattern.abstractProduct;

/**
 * Created by xianpeng.xia
 * on 2019/12/20 10:53 下午
 */
public class WhiteAnimalFactory implements IAnimalFactory {

    @Override
    public ICat createCat() {
        return new WhiteCat();
    }

    @Override
    public IDog createDog() {
        return new WhiteDog();
    }
}
