package Task05;

public class Main {
    public static void main(String[] args) {

        Item item = new Item("Product", 5.0, 16.5);
        DeparturePoint departurePoint = new DeparturePoint("Departure Address");
        ReceivePoint receivePoint = new ReceivePoint("Receive Address");
        Shipment shipment = new Shipment(item, departurePoint, receivePoint);

        Customer customer = new Customer("Maria Smith", "Customer`s Address");

        System.out.println("Shipment details:");
        System.out.println("Item: " + shipment.item.name);
        System.out.println("Departure Point: " + shipment.departurePoint.address);
        System.out.println("Receive Point: " + shipment.receivePoint.address);
        System.out.println("Customer: " + customer.name);
    }
}
