package Task05;

import java.util.ArrayList;
import java.util.List;

class ShipmentMethods {
    private static final List<String> validDeliveryOfficeAddresses = new ArrayList<>();

    static {
        validDeliveryOfficeAddresses.add("45 Main St. Nashville, USA");
        validDeliveryOfficeAddresses.add("407 Main St. Nashville, USA");
    }

    public Shipment createShipment(Customer customer, DeparturePoint departurePoint, ReceivePoint receivePoint, Item... items) {
        boolean isWithinDeliveryRange = checkDeliveryRange(receivePoint);

        String deliveryMethod = isWithinDeliveryRange ? "Truck" : "Bicycle Courier";

        boolean isSizeAllowed = checkSizeRestrictions(deliveryMethod, items);
        boolean isWeightAllowed = checkWeightRestrictions(deliveryMethod, items);

        if (!isSizeAllowed || !isWeightAllowed) {
            System.out.println("Shipment does not meet size or weight restrictions for " + deliveryMethod + " delivery.");
            return null;
        }

        Shipment shipment = new Shipment(customer, departurePoint, receivePoint, items);
        shipment.setDeliveryMethod(deliveryMethod);

        return shipment;
    }

    public void cancelShipment(Shipment shipment) {
        shipment.setCanceled(true);
    }

    public void printShipmentDetails(Shipment shipment) {
        System.out.println("Shipment details:");
        System.out.println("Customer: " + shipment.getCustomer().getName());
        System.out.println("Departure Point: " + shipment.getDeparturePoint().getName());
        System.out.println("Receive Point: " + shipment.getReceivePoint().getName());
        System.out.println("Items:");

        for (Item item : shipment.getItems()) {
            System.out.println("  - " + item.getName());
        }

        System.out.println("Delivery Method: " + shipment.getDeliveryMethod());

        if (shipment.isCanceled()) {
            System.out.println("This shipment has been canceled.");
        }

        System.out.println("------------------------------");
    }

    private boolean checkDeliveryRange(ReceivePoint receivePoint) {
        String receivePointAddress = receivePoint.getName();
        return validDeliveryOfficeAddresses.contains(receivePointAddress);
    }

    private boolean checkSizeRestrictions(String deliveryMethod, Item... items) {
        double totalSize = 0;

        for (Item item : items) {
            totalSize += item.getSize();
        }

        if ("Truck".equalsIgnoreCase(deliveryMethod)) {
            return totalSize <= 10000.0;
        } else if ("Bicycle Courier".equalsIgnoreCase(deliveryMethod)) {

            return totalSize <= 500.0;
        } else {
            return false;
        }
    }

    private boolean checkWeightRestrictions(String deliveryMethod, Item... items) {
        double totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        if ("Truck".equalsIgnoreCase(deliveryMethod)) {

            return totalWeight <= 500.0;
        } else if ("Bicycle Courier".equalsIgnoreCase(deliveryMethod)) {

            return totalWeight <= 10.0;
        } else {

            return false;
        }
    }
}
