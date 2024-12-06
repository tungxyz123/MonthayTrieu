package Two;


import java.io.*;

public class LinearSpaceExample {
    public static void createArray(int n) {
        int[] arr = new int[n]; // Memory usage grows linearly with the size of n
        for (int i = 0; i < n; i++) {
            arr[i] = i; // Initializing array elements
        }
    }

    public static void main(String[] args) {
        createArray(100); // Allocates memory for an array of size 100
    }
}






