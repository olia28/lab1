package Task05;

class Shipment {
    private final Customer customer;
    private final DeparturePoint departurePoint;
    private final ReceivePoint receivePoint;
    private final Item[] items;
    private boolean isCanceled;
    private String deliveryMethod;

    public Shipment(Customer customer, DeparturePoint departurePoint, ReceivePoint receivePoint, Item[] items) {
        this.customer = customer;
        this.departurePoint = departurePoint;
        this.receivePoint = receivePoint;
        this.items = items;
        this.isCanceled = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public DeparturePoint getDeparturePoint() {
        return departurePoint;
    }

    public ReceivePoint getReceivePoint() {
        return receivePoint;
    }

    public Item[] getItems() {
        return items;
    }

    public boolean isCanceled() {
        return isCanceled;
    }

    public void setCanceled(boolean canceled) {
        isCanceled = canceled;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }
}

