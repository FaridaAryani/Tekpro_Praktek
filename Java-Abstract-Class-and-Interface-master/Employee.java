package store;

public interface Employee {
    double calculatePay();
    boolean checkPromotionEligibility();

    // New abstract method
    void performDuties();

    // Existing abstract method in the Employee interface
    void performDuties();
}
