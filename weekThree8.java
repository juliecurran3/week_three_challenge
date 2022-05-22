package weekThreeCodingAssignment;

/**
 * #8
 * print a full name using a method
 * peram firstName a person's first name
 * peram lastName a person's last name
 * result A full name with a space between first and last. 
 */
public class weekThree8 {
 
  public static void main(String[] args) {
    String firstName = "Kevin";
    String lastName = "Bacon"; 
    String fullName = writeFullName(firstName, lastName);
    
    System.out.print(fullName);

  }
  public static String writeFullName(String first, String last) {
      return first + " " + last;
  }
}
