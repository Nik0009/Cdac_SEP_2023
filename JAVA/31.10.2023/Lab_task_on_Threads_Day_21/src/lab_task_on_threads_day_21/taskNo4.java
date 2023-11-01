/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_task_on_threads_day_21;

/**
 *
 * @author NIKHIL MOWADE
 */
public class taskNo4 {
    public static void main(String[] args) {
        int limit = 100;
        long sum = 0;
        Thread[] threads = new Thread[limit];

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                final int num = i;
                threads[i - 2] = new Thread(() -> sum += num);
                threads[i - 2].start();
            }
        }

        for (Thread thread : threads) {
            try {
                if (thread != null) {
                    thread.join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of prime numbers up to " + limit + ": " + sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
