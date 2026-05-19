// Write a Java program that asks the user for the length of an array then creates a double data-type array of that length by taking inputs from the user.
// Then do the following:
// a. Show the maximum element and its index from the array.
// b. Show the minimum element and its index from the array.
// c. Show the summation of all the elements from the array.
// d. Show the average of all the elements from the array.

import java.util.Scanner;

public class LAB7HW3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int n = sc.nextInt();
    double [] numbers = new double [n];
    double max =-2147483648, min =2147483647 , sum=0; 
    int max_index=0, min_index=0;
    
    for (int k=0; k<numbers.length;k++){
      System.out.print("Enter a number: ");
      numbers[k] = sc.nextDouble();
    }
    System.out.println();
    for (int i = 0; i < numbers.length ; i++){
      sum += numbers[i];
      if (numbers[i]<min){
        min = numbers[i];
        min_index = i;
      }
      if (numbers[i]>max){
        max = numbers[i];
        max_index = i;
      }
    }
    System.out.printf("Maximum element %.1f found at index %d\n",max,max_index);
    System.out.printf("Minimum element %.1f found at index %d\n",min,min_index);
    System.out.printf("Summation: %.1f\n",sum);
    System.out.printf("Average: %.2f\n",(sum/numbers.length));
    sc.close();
  }
}
