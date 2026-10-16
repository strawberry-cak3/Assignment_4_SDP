package subsystem;

public class CourierService {
    public void deliverItem(String itemName) {
        System.out.println("[CourierService] Courier took " + itemName + " and flyes to hero");
        System.out.println("[CourierService] Deliver is completed");
    }
}
