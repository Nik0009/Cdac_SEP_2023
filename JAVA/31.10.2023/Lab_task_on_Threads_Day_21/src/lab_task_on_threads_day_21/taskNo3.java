/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_task_on_threads_day_21;

/**
 *
 * @author NIKHIL MOWADE
 */
public class taskNo3 {
    public static void main(String[] args) {
        Runnable myRunnable = () -> {
            System.out.println("Inside the run method.");
        };

        myRunnable.run(); // Calls the run method directly.
    }
}
