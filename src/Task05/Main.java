package Task05;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane Smith");
        DeparturePoint departurePoint = new DeparturePoint("45 Main St. Nashville, USA");
        ReceivePoint receivePoint = new ReceivePoint("18 Green St. Kansas City, USA");

        Item item1 = new Item("Phone", 0.5, 10.0);
        Item item2 = new Item("Hardcover book", 1.5, 16.0);

        ShipmentMethods methods = new ShipmentMethods();
        Shipment shipment1 = methods.createShipment(customer, departurePoint, receivePoint, item1, item2);

        System.out.println("Shipment details before cancellation:");
        methods.printShipmentDetails(shipment1);

        methods.cancelShipment(shipment1);

        System.out.println("Shipment details after cancellation:");
        methods.printShipmentDetails(shipment1);
    }
}