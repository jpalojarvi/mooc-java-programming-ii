
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

        ProductWarehouseWithHistory pwh = new ProductWarehouseWithHistory("beer", 10, 2);
        pwh.history();
    }

}
