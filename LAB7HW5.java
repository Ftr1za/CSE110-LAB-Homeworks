// You are given two arrays of the same length. 
// The first array contains the marks of the students and the second array contains the name of the students. 
// You need to sort the marks array in ascending order while maintaining the corresponding names of the students in the names array aligned with their respective marks. 
// Use the Bubble sort technique to solve this problem. [Your code should work for any given arrays]

public class LAB7HW5{
  public static void main(String [] args){
    int [] marks ={85,90,75,44,99};
    String [] names = {"Bob","Alice","Max","Marry","Rosy"};
    
    for (int i=0 ; i < marks.length -1; i++){
      for (int k=0 ; k < marks.length-1-i;k++){
        if ( marks[k] > marks[k+1]){
          int temp= marks[k+1];
          marks[k+1]=marks[k];
          marks[k]=temp;
          
          String temp2 = names[k+1];
          names[k+1] =names[k];
          names[k]= temp2;
        }
      }
    }
    System.out.println("Sorted Array:");
    for (int m=0; m<marks.length; m++){
      System.out.print(marks[m]+" ");
    }
    System.out.println();
     for (int n=0; n<names.length; n++){
      System.out.print(names[n]+" ");
    }
    System.out.println();
  }
}
