package store;

public interface Store {
    static final double COMMISSION_RATE = 0.10;
    static final double TAX = 0.14;
    public double calculateCommission();
    public double calculateRemainingStoreRevenue(double storeSales);

    // New abstract method
    void manageInventory();

    // Existing abstract method in the Store interface
    void manageInventory();
}
