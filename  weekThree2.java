package weekThreeCodingAssignment2;
/**
 * #2
 * Average number and names printed with spaces
 * Average number of letters per name
 * @result average number of letters per name and the names
 * printed with spaces. 
 */

public class weekThree2 {
  public static void main(String[] args) {
  
      String[] names = new String [] {
        "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob",};
      int total = 0;
      for(String name : names) {
        total += name.length();
      }
      System.out.println(total / names.length);
      //Part B:
      
      String namesStr = "";
      for(String name : names) {
        namesStr += name + " ";}
      namesStr = namesStr.substring(0, namesStr.length() - 1);
      System.out.println(namesStr);
      }
  }