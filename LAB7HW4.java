import java.util.Scanner;

public class LAB7HW4{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the length of array 1: ");
    int n1 = sc.nextInt();
    int [] array1 = new int [n1];
    System.out.println("Please enter the elements of the arr1: ");
    
    for (int i=0; i < array1.length ; i++){
      array1[i] = sc.nextInt();
    }
    
    System.out.print("Please enter the length of array 2: ");
    int n2 = sc.nextInt();
    int [] array2 = new int [n2];
    System.out.println("Please enter the elements of the arr2: ");
    
    for (int j=0; j < array2.length ; j++){
      array2[j] = sc.nextInt();
    }
    
    int dup_element = 0;
    
    for (int k =0; k < array1.length ; k++){
      for (int l= k+1; l< array1.length; l++){
        if (array1[k] == array1[l]){
          dup_element++;
        }
      }
    }
    int n3 = array1.length - dup_element;
    int [] array3= new int [n3];
    int z=0;
    
    for (int q =0; q < array1.length ;q++){
      boolean checker = false;
      
      for (int r= q+1; r< array1.length;r++){
        if (array1[q] == array1[r]){
          checker=true;
        }
      }
        if(!checker){
          array3[z]=array1[q];
          z++;
        }
    }
    int subCount=0;
    for (int t=0; t< array3.length;t++){
      for (int u=0; u<array2.length;u++){
        if ( array3[t]==array2[u]){
          subCount++;
        }
      }
    }
    if (subCount == array2.length){
      System.out.println("Array 2 is a subset of Array 1.");
    }
    else{
      System.out.println("Array 2 is not a subset of Array 1.");
    }
    sc.close();
  }
}
      
      