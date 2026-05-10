public class LAB9HW2{
  public static void main(String [] args){
    int x = power(5,3);
    System.out.println(x);
    x = power(8,4);
    System.out.println(x);
  }
  public static int power(int base, int exp){
    if (exp == 1){
      return base;
    }
    return base * power(base, exp-1);
  }
}
