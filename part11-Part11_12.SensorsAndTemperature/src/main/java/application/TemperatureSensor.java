
package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean isOn;

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() {
        if (this.isOn()){
            int temperature = new Random().nextInt(61);
            return temperature-30;
        } else {
            throw new IllegalStateException();
        }
    }

}
