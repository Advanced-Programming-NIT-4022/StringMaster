public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] splited_string = sentence.split(" ");
        if (number < 1 | number > splited_string.length) return "Number = " + number + " is out Of Bound";
        return splited_string[number - 1];
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        int count = 0;
        for (Character i : number.toCharArray()) {
            int numeric_i = Character.getNumericValue(i);
            if (numeric_i >= 0 & numeric_i < 10) if ((Character.getNumericValue(i) % 2 == 0) == searchForEven) count++;
        }
        return count;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        for (int i = 0; i < wordA.length(); i++) {
            if (wordA.charAt(i) == wordB.charAt(i)) continue;
            if (wordA.charAt(i) > wordB.charAt(i)) return wordB;
            else return wordA;
        }
        return wordA;
    }
}
