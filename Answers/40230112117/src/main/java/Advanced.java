import java.lang.reflect.Array;
import java.util.Objects;

public class Advanced {
    public static void main(String[] args) {

    }


    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
        String[] a = sentence.split(" ");
        for (int i=0; i<a.length; i++){
            if (a[i].equals(word)){
                a[i] = newWord;
            }
        }
        String b = "";
        for (int i = 0; i < a.length; i++) {
            b = b+a[i]+" ";
        }
        b = b.trim();
    return b;
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){

        String fs = firstName.toLowerCase();
        String ls = lastName.toLowerCase();
        String fc = fs.substring(0,1).toUpperCase() + fs.substring(1);
        String lc = ls.substring(0,1).toUpperCase() + ls.substring(1);
        String output = fc + " " + lc;
        return output;
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if (result.length() == 0 || ch != result.charAt(result.length()-1)){
                result.append(ch);
            }
        }
        return result.toString();

    }
}


