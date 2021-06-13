package application;

public class StandardSensor implements Sensor {

    private int number;

    public StandardSensor(int number) {
        this.number = number;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
//        this.isOn = true;
    }

    @Override
    public void setOff() {
//        this.isOn = false;
    }

    @Override
    public int read() {
        if (this.isOn()) {
            return this.number;
        } else {
            throw new IllegalStateException();
        }
    }

}
