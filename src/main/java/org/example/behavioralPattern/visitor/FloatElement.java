package org.example.behavioralPattern.visitor;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 15:29
 */
public class FloatElement implements Visitable {

    private Float fe;

    public FloatElement(Float fe) {
        this.fe = fe;
    }

    public Float getFe() {
        return fe;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitFloat(this);
    }
}
