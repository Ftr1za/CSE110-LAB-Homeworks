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