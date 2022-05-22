package weekThreeCodingAssignment;

public class weekThree7 {
  /**
   * take a word and repeat it a number of times.  
   * @param word is any word 
   * @param n the number of times the word is repeated
   * Results word is repeated a set number of times.
   */

  public static void main(String[] args) {    
    String word = "Hello";
    int n = 3;
    String wordMulti = wordMultiplier(word, n);
    System.out.println(wordMulti);
  }
    public static String wordMultiplier(String word, int n) { 
      
      String wordMultiplier = "";
      for(int x = 0; x < n; x++) {
        wordMultiplier += word;
      }
      return wordMultiplier;  
      }
    }
       
   

  


