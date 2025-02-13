package org.example.Service;
public class Calculator {

   // Method to add multiple integers
   public int add(int... numbers) {
      int sum = 0;
      for (int num : numbers) {
         sum += num;
      }
      return sum;
   }

   // Method to multiply multiple integers
   public int multiply(int... numbers) {
      int result = 1;
      for (int num : numbers) {
         result *= num;
      }
      return result;
   }

   // Method to subtract multiple integers
   public int subtract(int... numbers) {
      int result = numbers[0]; // Start with the first number
      for (int i = 1; i < numbers.length; i++) {
         result -= numbers[i];
      }
      return result;
   }
}
