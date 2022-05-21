package weekThreeCodingAssignment;

public class weekThree {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
     int[] studentAges = new int[10];
     
     studentAges[0] = 3;
     studentAges[1] = 9;
     studentAges[2] = 23;
     studentAges[3] = 64;
     studentAges[4] = 2;
     studentAges[5] = 8;
     studentAges[6] = 28;
     studentAges[7] = 93;
     studentAges[8] = 2;
     studentAges[9] = 100;
     
     System.out.println(studentAges[0] - studentAges[studentAges.length - 1]); 
     int total = 0;
     for(int x : studentAges ) {
       total += x;
     }
     System.out.println(total / studentAges.length);
  }
}