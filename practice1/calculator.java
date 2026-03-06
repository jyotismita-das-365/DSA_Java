import java.util.*;

public class calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number:");
    int a = sc.nextInt();
    System.out.println("Enter second number");
    int b = sc.nextInt();
    System.out.println("Enter operator:");
    char operator = sc.next().charAt(0);
    int result;

    switch (operator) {
      case '+':
        result = a+b;
        System.out.println(result);
        break;
      
      case '-':
        result = a-b;
        System.out.println(result);
        break;

      case '*':
        result = a*b;
        System.out.println(result);
        break;

      case '/':
        result = a/b;
        System.out.println(result);
        break;
    }
  }
}