// Write a recursive method called factorial(n) that returns the factorial of a number n. Assume n>= 0.


public class LAB9HW1{
  public static void main(String [] args){
    int x = factorial(5);
    System.out.println(x);
    x = factorial(7);
    System.out.println(x);
  }
  
  public static int factorial(int x){
    if (x ==1){
      return x;
    }
    return x * factorial(x-1);
  }
}
