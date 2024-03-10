package store;

public class Cashier extends AbstractStoreEmployee {
    private static final double OVERTIME_PAY_RATE = 1.5;
    private static final double PROMOTION_ELIGIBILITY_THRESHOLD_CASHIER = 20000.0;

    public Cashier(double numberOfHoursWorked, double hourlyRate, String storeDetails,
                   double basePay, String employeeName) {
        super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, employeeName);
    }

    @Override
    public double calculateCommission() {
        // Cashiers don't receive commission
        return 0.0;
    }

    @Override
    public double calculatePay() {
        // Cashiers receive overtime pay for hours worked beyond the standard work hours
        double overtimePay = 0.0;
        if (super.getNumberOfHoursWorked() > 40) {
            double overtimeHours = super.getNumberOfHoursWorked() - 40;
            overtimePay = overtimeHours * super.getHourlyRate() * OVERTIME_PAY_RATE;
        }

        return super.getBasePay() + overtimePay + (super.getNumberOfHoursWorked() * super.getHourlyRate());
    }

    @Override
    public boolean checkPromotionEligibility() {
        return calculatePay() > PROMOTION_ELIGIBILITY_THRESHOLD_CASHIER;
    }

    @Override
    public void performDuties() {
        System.out.println("Handling customer transactions and payments.");
    }

    // Implementasi metode baru pada Store interface
    @Override
    public void manageInventory() {
        System.out.println("Assisting in inventory management at the checkout.");
    }
}
