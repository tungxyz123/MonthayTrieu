import java.util.Random;

public class SortingComparison {

    // Bubble Sort implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort implementation
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[minIndex] and arr[i]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to generate a random array
    public static int[] generateRandomArray(int size, int maxValue) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(maxValue);
        }
        return arr;
    }

    public static void main(String[] args) {
        // Define the array size and maximum value
        int arraySize = 1000;
        int maxValue = 10000;

        // Generate a random array
        int[] originalArray = generateRandomArray(arraySize, maxValue);

        // Copy the array for Bubble Sort
        int[] bubbleArray = originalArray.clone();
        // Copy the array for Selection Sort
        int[] selectionArray = originalArray.clone();

        // Measure execution time for Bubble Sort
        long startTime = System.nanoTime();
        bubbleSort(bubbleArray);
        long bubbleSortTime = System.nanoTime() - startTime;

        // Measure execution time for Selection Sort
        startTime = System.nanoTime();
        selectionSort(selectionArray);
        long selectionSortTime = System.nanoTime() - startTime;

        // Print results
        System.out.println("Array Size: " + arraySize);
        System.out.println("Bubble Sort Time: " + bubbleSortTime + " nanoseconds");
        System.out.println("Selection Sort Time: " + selectionSortTime + " nanoseconds");
    }
}
