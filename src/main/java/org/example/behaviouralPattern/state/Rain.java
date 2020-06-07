package org.example.behaviouralPattern.state;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 13:05
 */
public class Rain implements Weather {

    @Override
    public String getWeather() {
        return "下雨";
    }
}
