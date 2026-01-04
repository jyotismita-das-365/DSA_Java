// Create a program to swap two numbers. 
public class swap {
  public static void main(String[] args) {
    int a=10;
    int b=20;
    int c;

    System.out.println("Before Swap a, b" + a +" "+b);
    c=b;
    b=a;
    a=c;
    System.out.println("After Swap a, b" + a + " " +b);
  }
}