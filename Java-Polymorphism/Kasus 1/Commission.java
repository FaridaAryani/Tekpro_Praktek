public class Commission extends Hourly {
    private double Totalsales;
    private double Commissionrate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,
            double Commissionrate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
    }

    void addSales(double totSales) {
        Totalsales += totSales;
    }

    public double pay() {
        double payment = super.pay() + (Commissionrate * Totalsales);
        Totalsales = 0.0;
        return payment;
    }

    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + Totalsales;
        return result;
    }
}