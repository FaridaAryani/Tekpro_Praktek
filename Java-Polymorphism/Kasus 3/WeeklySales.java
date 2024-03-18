public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] salesStaff = new Salesperson[10];

        salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
        salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
        salesStaff[2] = new Salesperson("James", "Jones", 3000);
        salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
        salesStaff[4] = new Salesperson("Don", "Trump", 1570);
        salesStaff[5] = new Salesperson("Jane", "Black", 3000);
        salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
        salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
        salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
        salesStaff[9] = new Salesperson("Walt", "Smith", 3000);

        // Ascending
        Sorting.insertionSort(salesStaff);
        System.out.println("\n insertsort ascending: ");
        System.out.println("Ranking sales:");
        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }

        // Decending
        Sorting.insortDesc(salesStaff);
        System.out.println("\n insertsort decending: ");
        System.out.println("Ranking sales: ");
        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }
    }
}