package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        // comment
        System.out.println("enter the number of hours the employi worcked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();


        System.out.println("enter the employee's pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();
        double grossPay = hours * rate;

        System.out.println(grossPay);





    }
}
