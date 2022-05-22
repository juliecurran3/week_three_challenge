package weekThreeCodingAssignment;
/**
 * This helps to decide if a drink should be purchased.
 * @param isHotOutside tells us if it's hot enough.
 * @param moneyInPocket tells us if there is enough money.
 * @result if both are true then a drink should be purchased.  
 */

public class weekThree12 {

  public static void main(String[] args) {
    boolean isHotOutside = true;
    double moneyInPocket = 11.50;
    System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
  }
  public static boolean willBuyDrink(boolean hotOutside, double money) {
    return hotOutside && money > 10.50;
  }
}   
