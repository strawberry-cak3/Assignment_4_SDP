package subsystem;

public class RecipeCraftingSystem {
    public boolean checkComponents(String itemName) {
        System.out.println("[RecipeCraftingSystem] Checking components and recipe for craft " + itemName + "...");
        return true;
    }
    public void assembleItem(String itemName) {
        System.out.println("[RecipeCraftingSystem] " + itemName + " successfully crafted!");
    }
}
