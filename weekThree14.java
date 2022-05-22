package weekThreeCodingAssignment;

public class weekThree14 {
  public static void main(String[] args) {
    int[] applesInBaskets = {5,7,8};
    System.out.println(basketTotal(applesInBaskets));  
  }
  /**
   * counts the number of apples in all baskets
   * I own an imaginary pick-your-own apple orchard and I wanted to create
   * a way to determine how many apples we sold if I just know how many baskets 
   * we had and the number in each basket. 
   * @param appleBaskets an array of each basket and how much it contains
   * @return sum of all baskets
   * 
   */
  public static int basketTotal(int[] appleBaskets) {
    int sum = 0;
    for(int apples : appleBaskets) {
      sum += apples;
    }
    return sum;
  }
}
  
      