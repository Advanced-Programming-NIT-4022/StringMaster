import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
        sentence = sentence.replace(word, newWord);
        return sentence;
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){
        firstName = firstName.toLowerCase();
        String firstLetterName = firstName.substring(0,1);   //extracting the first word.
        firstName = firstLetterName.toUpperCase() + firstName.substring(1);

        // first name is uppercase first word + rest of the word.

        boolean check = lastName.isBlank();
        if (check==false) {
            lastName = lastName.toLowerCase();
            String firstLetterLastName = lastName.substring(0, 1);
            lastName = firstLetterLastName.toUpperCase() + lastName.substring(1);

            String fullName = firstName + " " + lastName;
            return fullName;
        }
        else
            return firstName;
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
    String answer="";
    for (int i=0 ; i<word.length()-1 ; i++){
        char previous = word.charAt(i);
        char current = word.charAt(i+1);
        if(previous!=current)
            answer= answer+previous;
        else{
            continue;
        }
    }
    answer = answer+word.charAt(word.length()-1);   //adding the last word.
    return answer;
    }
}

