// A. Write a method called calcTax that takes 2 arguments which are your age then your salary. 
// The method must calculate and return the tax as per the following conditions:
// ● No tax if you are less than 18 years old.
// ● No tax if you get paid less than 10,000
// ● 7% tax if you get paid between 10,000 and 20,000 (both inclusive)
// ● 14% tax if you get paid more than 20,000
// B. Write a method called calcYearlyTax that takes no arguments. 
// Inside the method it should take first input as your age and then 12 other inputs as income of each month of the year. 
// The method must calculate and print Tax for each month and finally print the total Tax of the whole year based on the A conditions.
// Note: You must call the method written in task 3A, otherwise this task would be considered invalid.


import java.util.Scanner;
public class LAB8HW3{
  public static void main(String [] args){
    calcYearlyTax();
  }
  
  public static double calcTax (int age, int salary){
    double tax = 0;
    if (age < 18 || salary < 10000){
      tax=0;
    }
    else if (age >= 18 && salary >= 10000 && salary <= 20000){
      tax = (7.0/100)*salary;
    }
    else if (age >= 18 && salary > 20000){
      tax = (14.0/100)*salary;
    }
    return Math.round(tax*100.0)/100.0;
  }
  public static void calcYearlyTax(){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    double yTax=0;
    int [] input = new int [12];
    for ( int i=0 ; i<12; i++){
      input[i] = sc.nextInt();
    }
    for (int k=0 ; k<12; k++){
      double tax = calcTax(age, input[k]);
      System.out.printf("Month%d tax: %.1f",k+1,tax);
      System.out.println();
      yTax+=tax;
    }
    System.out.printf("Total Yearly Tax: %.1f",yTax);
    System.out.println();
  }
}
