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