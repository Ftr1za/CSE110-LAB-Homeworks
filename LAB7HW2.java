// Write a Java program that will take N integer numbers from the user and create an array of length N. Take another number from the user and print the index of the number where it is found first. 
// If not found then print ‘Element not found’.
// Note: Think about how to apply the concept of flag and break in this task.


import java.util.Scanner;

public class LAB7HW2{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int n = sc.nextInt();
    int [] numbers = new int [n];
    boolean check = false;
    int index = 0;
    
    for (int i= 0;i < numbers.length; i++){
      System.out.print("Enter a number: ");
      numbers[i] = sc.nextInt();
    }
    System.out.println();
    int num = sc.nextInt();
    
    for (int j = 0; j < numbers.length ; j++){
      if (num == numbers[j]){
        check = true;
        index = j;
        break;
      }
    }
    if (check == true){
      System.out.printf("%d is at index %d\n",num,index);
    }
    else{
      System.out.println("Element not found");
    }
    sc.close();
  }
}
