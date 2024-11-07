import java.util.Stack;

/**
 * The NumberSorter class implements a sorting algorithm using two stacks.
 * It sorts an array of integers either in ascending or descending order.
 */
public class NumberSorter {

    /**
     * Sorts an array of integers using two stacks.
     *
     * @param numbers   the array of integers to be sorted
     * @param ascending a boolean flag indicating whether to sort in ascending order (true) or descending order (false)
     */
    public void sort(int[] numbers, boolean ascending) {
        // Create two stacks: source stack and destination stack
        Stack<Integer> srcStack = new Stack<>();
        Stack<Integer> destStack = new Stack<>();

        // Push all numbers from the array into the source stack
        for (int number : numbers) {
            srcStack.push(number);
        }

        // Sorting logic using two stacks
        while (!srcStack.isEmpty()) {
            int temp = srcStack.pop(); // Pop an element from the source stack

            // Place it in the correct position in the destination stack
            while (!destStack.isEmpty() &&
                    (ascending ? temp < destStack.peek() : temp > destStack.peek())) {
                srcStack.push(destStack.pop());  // Move elements back to the source stack
            }

            // Push the temp value into the destination stack
            destStack.push(temp);
        }

        // Copy the sorted elements back into the original array
        int index = 0;
        while (!destStack.isEmpty()) {
            numbers[index++] = destStack.pop();
        }
    }
}
