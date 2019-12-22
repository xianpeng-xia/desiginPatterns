package org.example.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xianpeng.xia
 * on 2019/12/22 9:08 下午
 */
public class Context {

    private String content;
    private List<Expression> list = new ArrayList();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void add(Expression expression) {
        list.add(expression);
    }

    public List<Expression> getList() {
        return list;
    }
}
