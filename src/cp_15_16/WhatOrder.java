package cp_15_16;

import java.util.Scanner;

public class WhatOrder {
   // TODO: Define a generic method called checkOrder() that 
   //       takes in four variables of generic type as arguments. 
   //       The return type of the method is integer
   
   
      // Check the order of the input: return -1 for ascending, 
      // 0 for neither, 1 for descending



   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check order of four strings
        System.out.println(
                "Order: " + checkOrder(scanner.next(),
                        scanner.next(),
                        scanner.next(),
                        scanner.next())
        );

        // Check order of four doubles
        System.out.println(
                "Order: " + checkOrder(scanner.nextDouble(),
                        scanner.nextDouble(),
                        scanner.nextDouble(),
                        scanner.nextDouble())
        );
   }
}
