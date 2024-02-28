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
            char[] sentenceChars = new char[sentence.length() - word.length() + newWord.length()];
            int i, j;
            for (i = 0; i < index; i++)
                sentenceChars[i] = sentence.charAt(i);
            for (j = 0; j < newWord.length(); j++, i++)
                sentenceChars[i] = newWord.charAt(j);
            for (j = i - j + word.length(); i < sentenceChars.length; i++, j++)
                sentenceChars[i] = sentence.charAt(j);
            sentence = new String(sentenceChars);
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
    public String normalizingName(String firstName, String lastName){
        return null;
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        return null;
    }
}

