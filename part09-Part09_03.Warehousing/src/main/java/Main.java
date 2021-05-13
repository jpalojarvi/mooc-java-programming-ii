
public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        juice.addToWarehouse(1.0);
        System.out.println(juice);

        ChangeHistory ch = new ChangeHistory();
        ch.add(99);
        System.out.println();

        ProductWarehouseWithHistory fruit = new ProductWarehouseWithHistory("Fruit", 100, 5);
        System.out.println(fruit);

        ProductWarehouse pwh = new ProductWarehouseWithHistory("coffee", 10, 5);
        pwh.addToWarehouse(5);
        pwh.takeFromWarehouse(7);
        System.out.println(pwh.getBalance());
    }

}
