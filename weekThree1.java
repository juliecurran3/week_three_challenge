package weekThreeCodingAssignment;

public class weekThree1 {
 
  public static void main(String[] args) {
    /**
     * # 1
     * finds the difference between the first and last student age 
     * and average of all ages
     * @ results difference and average
     */
     int[] studentAges = new int[9];
     
     studentAges[0] = 3;
     studentAges[1] = 9;
     studentAges[2] = 23;
     studentAges[3] = 64;
     studentAges[4] = 2;
     studentAges[5] = 8;
     studentAges[6] = 28;
     studentAges[7] = 93;
     studentAges[8] = 2;
     
     System.out.println(studentAges[0] - studentAges[studentAges.length - 1]); 
     int total = 0;
     for(int x : studentAges ) {
       total += x;
     }
     System.out.println(total / studentAges.length);
  }
}