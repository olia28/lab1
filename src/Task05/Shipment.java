package Task05;

public class Shipment {
    Item item;
    DeparturePoint departurePoint;
    ReceivePoint receivePoint;

    public Shipment(Item item, DeparturePoint departurePoint, ReceivePoint receivePoint) {
        this.item = item;
        this.departurePoint = departurePoint;
        this.receivePoint = receivePoint;
    }
}
