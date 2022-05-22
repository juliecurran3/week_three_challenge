package weekThreeCodingAssignment;
/**
 * #9
 *  This calculates the total value of the array and
 *  compares the value to 100.
 *@Result If the total is greater than 100 then true will be printed.
 */

public class weekThree9 {
  public static void main(String[] args) {
    int[] theArray = {57, 134, 47, 13}; 
    int total = greaterThan(theArray);
    System.out.println(total > 100);
  }
  public static int greaterThan(int[] array) {
    int sum = 0;
    for(int i : array) {
      sum += i;}
    return sum;
  }
}
