package org.example.behavioralPattern.visitor;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 15:33
 */
public class StringElement implements Visitable {

    private String se;

    public StringElement(String se) {
        this.se = se;
    }

    public String getSe() {
        return se;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }
}
