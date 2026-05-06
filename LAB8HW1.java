// A. Write a method called isPrime which takes an integer in its parameter to check whether a number is prime or not. 
// If the number is prime then the method returns boolean true otherwise it returns boolean false.

// B.Write a method called isPerfect which takes an integer in its parameter to check whether a number is perfect or not. 
// If the number is perfect then the method returns boolean true otherwise it returns boolean false.

// C.Write a method called special_sum that calculates the sum of all numbers that are either prime numbers or perfect up till the integer value given in its parameter. 
// This integer value must be taken as user input and passed into the method.

// Note: You must call the methods written in task 1A & 1B, otherwise this task will be considered invalid.

  public class LAB8HW1{
  public static void main(String [] args){
    int result = special_sum(8);
    System.out.println(result);
  }
  
  public static boolean isPrime(int x){
    int divider_count= 0;
    for (int i=1 ; i <= x; i++){
      if (x%i ==0){
        divider_count++;
      }
    }
    if (divider_count==2){
      return true;
    }
    else{
      return false;
    }
  }
  
  public static boolean isPerfect(int x){
    int sum =0;
    for (int i=1; i<x ;i++){
      if ( x % i==0){
        sum+=i;
      }
    }
    if(sum==x){
      return true;
    }
    else{
      return false;
    }
  }
  public static int special_sum(int x){
    int sum=0;
    for (int i=1 ;i<= x; i++){
      if (isPrime(i)==true||isPerfect(i)==true){
        sum+=i;
      }
    }
    return sum;
  }
}
