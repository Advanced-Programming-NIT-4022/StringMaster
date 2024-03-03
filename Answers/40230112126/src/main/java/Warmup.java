public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] words = sentence.split(" ");

        if (number < 1 || number > words.length) {
            String errorPrompt = "Number = " + number + "is out Of Bound";
            return errorPrompt;
        } else {
            return words[number - 1];
        }
    }
    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        int odd=0;
        int even=0;

        for(int i=0; i < number.length(); i++) {
            if(number.charAt(i) % 2 == 1)
                odd++;
            else{
                even++;
            }
        }

        if (searchForEven == true)
            return even;
        else {
            return odd;
        }
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        int result = wordA.compareToIgnoreCase(wordB);
        if (result > 0)
            return wordB;
        else {
            if (result < 0)
                return wordA;
            else {
                return "identical words!";
            }
        }
    }
}
