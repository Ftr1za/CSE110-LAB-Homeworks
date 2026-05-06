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