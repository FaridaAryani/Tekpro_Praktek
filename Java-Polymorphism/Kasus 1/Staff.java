public class Staff {
    StaffMember[] stafflist;

    // Sets up the list of staff members
    public Staff() {
        stafflist = new StaffMember[8];

        stafflist[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        stafflist[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        stafflist[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        stafflist[3] = new Hourly("Dian", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
        stafflist[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
        stafflist[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
        stafflist[6] = new Commission("Clara", "298 awarness", "555-8942", "030-43-2945", 6.25, 0.20);
        stafflist[7] = new Commission("Joy", "309 loly", "555-8754", "854-39-5849", 9.75, 0.15);

        ((Executive) stafflist[0]).awardBonus(500.00);
        ((Hourly) stafflist[3]).addHours(40);
        ((Commission) stafflist[6]).addHours(35);
        ((Commission) stafflist[6]).addSales(400);
        ((Commission) stafflist[7]).addHours(40);
        ((Commission) stafflist[7]).addSales(950);
    }

    // Pays all staff members
    public void payday() {
        double amount;
        for (int count = 0; count < stafflist.length; count++) {
            System.out.println(stafflist[count]);
            amount = stafflist[count].pay();
            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid: " + amount);
            }
            System.out.println("--------------------------------------------------------");
        }
    }
}