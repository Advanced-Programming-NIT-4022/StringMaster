import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord) {
        int index = sentence.indexOf(word);
        while (index >= 0) {
            sentence = String.valueOf(sentence.toCharArray(), 0, index) + newWord + String.valueOf(sentence.toCharArray(), index + word.length(), sentence.length() - index - word.length());
            index = sentence.indexOf(word, index - word.length() + newWord.length() + 1);
        }
        return sentence;
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName) {
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        if (lastName.isBlank())
            return firstName;
        else if (firstName.isBlank())
            return lastName;
        return firstName + " " + lastName;
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        if (word.isEmpty()) return "";
        char[] newWord = new char[word.length()];
        newWord[0] = word.charAt(0);
        int lenght = 1;
        char[] wordChars = word.toCharArray();
        for (int i = 1; i < wordChars.length; i++) {
            if (wordChars[i] != newWord[lenght - 1]) {
                newWord[lenght] = wordChars[i];
                lenght++;
            }
        }
        return String.valueOf(newWord, 0, lenght);
    }
}

