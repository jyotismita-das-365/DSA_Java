public class Varuse {
  public static void main(String[] args){
    int item = 50;
    float costPerItem = 9.99f;
    float totalCost = item * costPerItem;
    char currency = '$';

    System.out.println("Number of item"+ item);
    System.out.println("Cost per item"+ costPerItem + currency);
    System.out.println("Total cost ="+ totalCost + currency);
  }
}