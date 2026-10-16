package subsystem;

public class InventoryManager {
    public boolean hasFreeSlot(String[] inventory) {
        System.out.println("[InventoryManager] Проверка свободных ячеек в инвентаре...");

        for (String slot : inventory) {
            if (slot == null) {
                System.out.println("[InventoryManager] Свободный слот найден.");
                return true;
            }
        }
        System.out.println("[InventoryManager] Инвентарь забит!.");
        return false;
    }
    public void addItem(String[] inventory, String itemName) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = itemName;
                System.out.println(
                        "[InventoryManager] Предмет " + itemName + " добавлен в слот" + (i + 1));
            }
        }
    }
}
