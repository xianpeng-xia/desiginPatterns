package org.example.behaviouralPattern.state;

/**
 * @author 夏先鹏
 * @date 2019/12/23
 * @time 13:06
 */
public class Context {

    private Weather weather;

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String weatherMessage() {
        return weather.getWeather();
    }
}
