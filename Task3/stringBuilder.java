import java.util.*;

public class stringBuilder{
  public static void main(String args[]){
    StringBuilder sb = new StringBuilder("jyoti");
    System.out.println(sb);

    System.out.println(sb.charAt(0));

    sb.setCharAt(0, 'A');
    System.out.println(sb);

    sb.insert(2, 'n');
    System.out.println(sb);

    sb.delete(2,3);
    System.out.println(sb);
    
    sb.append("A");
    System.out.println(sb);

    for(int i=0; i<sb.length()/2; i++){
      int front = i;
      int back = sb.length()-1-i;

      char frontChar = sb.charAt(front);
      char backChar = sb.charAt(back);

      sb.setCharAt(front, backChar);
      sb.setCharAt(back, frontChar);
    }
    System.out.println(sb);
  }
}