package application;

public class Program {

    public static void main(String[] args) {
        // you can test your classes here:
//        StandardSensor ten = new StandardSensor(10);
//        StandardSensor minusFive = new StandardSensor(-5);
//
//        System.out.println(ten.read());
//        System.out.println(minusFive.read());
//
//        System.out.println(ten.isOn());
//        ten.setOff();
//        System.out.println(ten.isOn());
//        
//        TemperatureSensor temp = new TemperatureSensor();
//        temp.setOn();
//        System.out.println(temp.read());

        AverageSensor ka = new AverageSensor();
        ka.addSensor(new TemperatureSensor());
    }

}
