// Write a recursive method called print_elements(arr, index) that prints elements of an array starting from index to the end.

public class LAB9HW3{
  public static void main(String [] args){
    int[] arr = {5,6,2,1,8,7};
    int index = 2;
    print_element(arr, index);
  }
  public static void print_element(int [] array,int idx){
    if (idx == array.length-1){
      System.out.println(array[idx]);
      return;
    }
    System.out.println(array[idx]);
    print_element(array, idx+1);
  }
}
