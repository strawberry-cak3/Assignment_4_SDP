import facade.ShopFacade;

public class Main {
    public static void main(String[] args) {
        ShopFacade shopFacade = new ShopFacade();

        int playerGold = 4500;
        String[] playerInventory = new String[6];

        shopFacade.purchaseItem("Aghanim's Scepter", 4200, playerGold, playerInventory);
    }
}