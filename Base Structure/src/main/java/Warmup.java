public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] redult = sentence.split(" ");

        if (number > 0 && number <= redult.length) {
            return redult[number - 1];
        } else {
            return " Number = " + number + " is out Of Bound";
        }
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        String[] num = number.split("");
        int count = 0;
        for (String i : num) {
            int num1 = Integer.parseInt(i);
            if (searchForEven && num1 % 2 == 0) {
                count++;
            } else if (!searchForEven && num1 % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        return null;
    }
}
