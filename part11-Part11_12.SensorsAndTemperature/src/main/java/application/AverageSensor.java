
package application;

import java.util.ArrayList;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors = new ArrayList<>();
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        int sensorsOn = 0;
        for (int i = 0; i < sensors.size(); i++){
            if (sensors.get(i).isOn()){
                sensorsOn++;
            }
        }
        return sensorsOn == this.sensors.size();
    }

    @Override
    public void setOn() {
        sensors.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        sensors.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        int sum = 0;
        for (int i = 0; i < sensors.size(); i++){
            sum += sensors.get(i).read();
        }
        return sum/sensors.size();
    }

}
