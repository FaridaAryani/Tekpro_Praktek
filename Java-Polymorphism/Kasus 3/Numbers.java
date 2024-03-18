import java.util.Scanner;

public class Numbers {
    // Read in an array of integers, sorts them
    // then prints them in sorted

    public static void main(String[] args) {
        Integer[] intList; // diubah
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("\n How many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];

        System.out.println("\n Enter the numbers...");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt();
        }

        // Selection
        Sorting.selectionSort(intList);
        System.out.println("\n Selection: ");
        System.out.println("\n Your numbers in sorted order....");
        for (int i = 0; i < size; i++) {
            System.out.println(intList[i] + " ");
        }
        System.out.println();

        // Ascending
        Sorting.insertionSort(intList);
        System.out.println("\n Ascending: ");
        System.out.println("\n Your numbers in sorted order....");
        for (int i = 0; i < size; i++) {
            System.out.println(intList[i] + " ");
        }
        System.out.println();

        // Descending
        Sorting.insortDesc(intList);
        System.out.println("Descending");
        System.out.println("\n Your numbers in sorted order....");
        for (int i = 0; i < size; i++) {
            System.out.println(intList[i] + " ");
        }
        System.out.println();

    }

    private static void printArray(Integer[] array) {
        System.out.println("\nYour numbers in sorted order:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}