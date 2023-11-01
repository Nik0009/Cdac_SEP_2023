package lab_task_on_threads_day_21;

//2.Write a Java program that sorts an array of integers using multiple threads

import java.util.Arrays;

public class taskNo2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6, 3, 8};
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

