// A. Write a simple method called showDots that takes a number as an argument and then prints that amount of dots inside the method.
// Note: You can use System.out.print() to avoid the next output being printed on the next line.
// B. Write a method called show_palindrome that takes a number as an argument and then prints a palindrome inside the method.
// Note: You can use System.out.print() to avoid the next output being printed on the next line.
// Write a method called showDiamond that takes an integer number as an argument and then prints a palindromic diamond shape. Moreover, the empty spaces surrounding the diamonds are filled with dots(.) .
// Note: You must call the methods written in task 2A & 2B, otherwise this task would be considered invalid.

public class LAB8HW2{
  public static void main(String [] args){
    showDiamond(3);
  }
  
  public static void showDots(int x){
    for (int i=1 ; i<=x ; i++){
      System.out.print(".");
    }
  }
  
  public static void show_palindrome(int x){
    for (int i=1; i<=x ;i++){
      System.out.print(i);
    }
    for (int k=x-1; k>=1 ;k--){
      System.out.print(k);
    }
  }
  
  public static void showDiamond(int x){
    for (int i=1; i<=x; i++){
      showDots(x-i);
      show_palindrome(i);
      showDots(x-i);
      System.out.println();
    }
    for (int k=x-1 ; k>=1; k--){
      showDots(x-k);
      show_palindrome(k);
      showDots(x-k);
      System.out.println();
    }
  }
}
