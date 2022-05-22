package weekThreeCodingAssignment;

public class weekThree5 {
  /**
   * 5 and 6
   * determines the lengths of all elements. 
   * Result 23 letters in the String of names.
   */

  public static void main(String[] args) {
    String[] names = new String [] {
        "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob",};
    int[] nameLengths = new int [names.length];
    for(int x = 0; x < names.length; x++) { 
      nameLengths[x] = names[x].length();} 
    int total = 0;
    for(int length: nameLengths) {
      total += length;}
    System.out.println(total);
  }
 }

