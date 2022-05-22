package weekThreeCodingAssignment;
/**
 * #10
 * Finds the average of a double array
 */
public class weekThree10 {

  public static void main(String[] args) {
    double[] decimals  = {51.2, 98.2, 52.5};
    double averages = arrayAverage(decimals);    
    System.out.println(averages);
  }
    public static double arrayAverage(double[] array) {
    int sum = 0;

    for(double i : array) {
      sum += i;
    }
    return sum / array.length;
  }
}