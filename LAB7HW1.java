import java.util.Scanner;

public class LAB7HW1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int N = sc.nextInt();
    
    int [] numbers = new int[N];
    
    for (int i = 0; i < numbers.length; i++){
      numbers[i] = sc.nextInt();
    }
    System.out.println("Original array: ");
    
    for (int j = 0; j < numbers.length; j++){
      System.out.print(numbers[j] + " ");
    }
    System.out.println();
    for (int k = 0; k < numbers.length ; k++){
      if (numbers[k] > 0){
        numbers[k]=1;
      }
      else if (numbers[k] < 0){
        numbers[k]=0;
      }
    }
    System.out.println("After modifying: ");
    for (int l = 0; l < numbers.length; l++){
      System.out.print(numbers[l] + " ");
    }
    System.out.println();
    sc.close();
  }
}