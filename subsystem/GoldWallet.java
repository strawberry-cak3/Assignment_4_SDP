package subsystem;

public class GoldWallet {
    public boolean hasEnoughGold(int currentGold, int itemPrice) {
        System.out.println("[GoldWallet] Checking for gold...");
        System.out.println("[GoldWallet] We have " + currentGold + "...");
        System.out.println("[GoldWallet] We need " + itemPrice + "...");

        return currentGold >= itemPrice;
    }
    public int DeductGold(int currentGold, int itemPrice) {
        int remaining = currentGold - itemPrice;
        System.out.println(
                "[GoldWallet] Gold deducted. Left: " + remaining
        );
        return remaining;
    }
}
