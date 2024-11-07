/**
 * The Driver class tests the NumberSorter functionality.
 * It creates instances of NumberSorter and tests both ascending and descending sorts.
 */
public class Driver2 {

    public static void main(String[] args) {
        NumberSorter sorter = new NumberSorter();

        // Test case 1: Sorting in ascending order
        int[] numbers1 = {1, 9, 2, 3, 10, 8, 12, 1, 99, 2, 43, 68, 109, 0};
        sorter.sort(numbers1, true);  // Sort in ascending order
        System.out.println("Sorted in ascending order:");
        printArray(numbers1);

        // Test case 2: Sorting in ascending order
        int[] numbers2 = {1, 2, 3, 4};
        sorter.sort(numbers2, true);  // Sort in ascending order
        System.out.println("Sorted in ascending order:");
        printArray(numbers2);

        // Test case 3: Sorting in descending order
        int[] numbers3 = {4, 3, 2, 1};
        sorter.sort(numbers3, false);  // Sort in descending order
        System.out.println("Sorted in descending order:");
        printArray(numbers3);
    }

    // Utility method to print an array
    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

