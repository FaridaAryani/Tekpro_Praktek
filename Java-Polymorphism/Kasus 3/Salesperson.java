public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    // Constructor : sets up the sales person object with the given data

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    // return the sales person as a string

    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    // return true if the sales people have the same name

    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName())
                && firstName.equals(((Salesperson) other).getFirstName()));
    }

    // order is based on total sales with the name(Last, the first) breaking a tie

    public int compareTo(Object other) {
        int result;
        Salesperson cmpr = (Salesperson) other;

        if (totalSales < cmpr.totalSales) {
            result = -1;
        } else if (totalSales > cmpr.totalSales) {
            result = 1;
        } else {
            if (lastName.compareTo(cmpr.lastName) < 0) {
                result = 1;
            } else if (lastName.compareTo(cmpr.lastName) > 0) {
                result = -1;
            } else if (firstName.compareTo(cmpr.firstName) < 0) {
                result = 1;
            } else if (firstName.compareTo(cmpr.firstName) > 0) {
                result = -1;
            } else {
                result = 0;
            }
        }
        return result;
    }

    // first name accessor

    public String getFirstName() {
        return firstName;
    }

    // last name accessor

    public String getLastName() {
        return lastName;
    }

    // total sales accesor

    public int getSales() {
        return totalSales;
    }
}