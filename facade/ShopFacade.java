package facade;

import subsystem.*;

public class ShopFacade {
    private GoldWallet goldWallet;
    private InventoryManager inventoryManager;
    private RecipeCraftingSystem craftingSystem;
    private CourierService courierService;

    public ShopFacade() {
        this.goldWallet = new GoldWallet();
        this.inventoryManager = new InventoryManager();
        this.craftingSystem = new RecipeCraftingSystem();
        this.courierService = new CourierService();
    }

    public void purchaseItem(String itemName, int itemPrice, int playerGold, String[] playerInventory) {
        System.out.println("--- Попытка купить предмет: " + itemName + " ---");

        if (!goldWallet.hasEnoughGold(playerGold, itemPrice)) {
            System.out.println("Error: not enough gold. ");
        }
        if (!inventoryManager.hasFreeSlot(playerInventory)) {
            System.out.println("Error: Not enough place!");
            return;
        }
        if(!craftingSystem.checkComponents(itemName)) {
            craftingSystem.assembleItem(itemName);
        }

        goldWallet.DeductGold(playerGold, itemPrice);
        inventoryManager.addItem(playerInventory, itemName);
        courierService.deliverItem(itemName);

        System.out.println("Покупка " + itemName + " успешно завершена!\n");
    }
}
