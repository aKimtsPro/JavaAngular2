package demo.pattern.listener;

import java.util.ArrayList;
import java.util.List;

public class Thermometre {

    // region singleton

    private static Thermometre instance;

    public static Thermometre getInstance() {
        return instance == null ? instance = new Thermometre() : instance;
    }

    private Thermometre() {
    }

    // endregion

    private int temperature = 0;

    private final List<ThermometreListener> listeners = new ArrayList<>();

    public Thermometre addListener(ThermometreListener p){
        listeners.add(p);
        return this;
    }

    private void notifyTemperatureChanged(){
        listeners.forEach(l -> l.onTemperatureChanged(this.getTemperature()));
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyTemperatureChanged();
    }
}
