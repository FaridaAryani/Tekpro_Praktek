import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String[] strList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("\n How many String do you want to sort?");
        size = scan.nextInt();
        scan.nextLine(); // read a newline
        strList = new String[size];

        System.out.println("\nEnter the String...");
        for (int i = 0; i < size; i++) {
            strList[i] = scan.nextLine();
        }

        // Selection
        Sorting.selectionSort(strList);
        System.out.println("Selection: ");
        System.out.println("Your Strings in sorted older...");
        for (int i = 0; i < size; i++) {
            System.out.println(strList[i] + " ");
        }

        // Ascending
        Sorting.insertionSort(strList);
        System.out.println("\n Ascending: ");
        System.out.println("Your Strings in sorted older...");
        for (int i = 0; i < size; i++) {
            System.out.println(strList[i] + " ");
        }
        System.out.println();

        // Descending
        Sorting.insortDesc(strList);
        System.out.println("Descending");
        System.out.println("Your Strings in sorted older...");
        for (int i = 0; i < size; i++) {
            System.out.println(strList[i] + " ");
        }
        System.out.println();
    }
}
