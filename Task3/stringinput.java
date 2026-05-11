// import java.util.*;
// public class stringinput{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     String name = sc.nextLine();
//     System.out.println("Your name is " + name);
//   }
// }

import java.util.*;

public class stringinput{
  public static void main(String args[]){
    String firstName = "jyoti";
    String lastName = "Das";
    String fullName = firstName +" " + lastName;
    System.out.println(fullName);
    System.out.println(fullName.length());

    for(int i=0; i<fullName.length(); i++){
      System.out.println(fullName.charAt(i));
    }

    //s1 > s2 : +ve value
    //s1 == s2 : 0 
    // s1 < s2 : -ve value
    if(firstName.compareTo(lastName) == 0){
      System.out.println("Strings are equal");
    }
    else{
      System.out.println("Strings are not equal");
    }
  }
}