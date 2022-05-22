package weekThreeCodingAssignment;

public class weekThree11 {

  /**
   *#11
   *If the average of the first array is greater than the average of second array
   * 
   */
  public static void main(String[] args){
    double[] firstSetOfNumbers = {15.5, 14.2, 47.1, 202.3};
    double[] secondSetOfNumbers = {18.5, 34.2, 17.5, 12.3};
    boolean averages = (eachArrayAverage(firstSetOfNumbers, secondSetOfNumbers));
    System.out.println(averages);  
  } 
  public static boolean eachArrayAverage(double[] array1, double[] array2) {
    double sum1 = 0;
    for(double i : array1) {
      sum1 += i;
    }
    double sum2 = 0;
    for(double i : array2) {
      sum2 += i;
    } 
    double firstSet = sum1 / array1.length;
    double secondSet = sum2 / array2.length;    
    return firstSet > secondSet;
  }
}
