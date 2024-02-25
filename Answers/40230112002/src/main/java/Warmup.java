public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] myArray = sentence.split(" ");
        if (number > myArray.length || number < 1){
            return " Number = " + number + " is out Of Bound";
        }
        else{
            return myArray[number - 1];
        }
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {

        String[] strArr = number.split("");

        int[] numArr = new int[strArr.length];

        for(int i = 0 ; i < numArr.length ; i++){

            numArr[i] = Integer.parseInt(strArr[i]);
        }

        int counter = 0;
        for (int eachNumber : numArr) {

            if (searchForEven) {
                if( eachNumber%2 == 0){
                    counter++;
                }
            }
            else{
                if(eachNumber%2 == 1){
                    counter++;
                }
            }
        }
        return counter;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        char[] word1 = wordA.toCharArray();
        char[] word2 = wordB.toCharArray();
        int MinimumLen = Math.min(word1.length, word2.length);

        int i = 0;

        while (i < MinimumLen) {

            if (word1[i] < word2[i]) {
                return wordA;
            } else if (word2[i] < word1[i]) {
                return wordB;
            } else {
                i++;
                continue;
            }
        }
        return null;
    }
}
