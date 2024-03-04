public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] sep = sentence.split(" ");
        String result = " Number = " + number + " is out Of Bound";
        if (number > 0 && number <= sep.length)
            return sep[number - 1];
        else
            return result;
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        char[] num = number.toCharArray();
        int countOdd = 0, countEven = 0;
        if (!searchForEven) {
            for (int i = 0; i < number.length(); i++) {
                if (num[i] == '1' || num[i] == '3' || num[i] == '5' || num[i] == '7' || num[i] == '9')
                    countOdd++;
            }
            return countOdd;
        }
        else {
            for (int i = 0; i < number.length(); i++) {
                if (num[i] == '0' || num[i] == '2' || num[i] == '4' || num[i] == '6' || num[i] == '8')
                    countEven++;
            }
            return countEven;
        }
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        int common_length = (wordA.length() <= wordB.length())? wordA.length():wordB.length();
        int i = 0;
        String flag = " ";
        while(i < common_length)
        {
            if(wordA.charAt(i) == wordB.charAt(i))
                i++;
            else
            {
                if((int)wordA.charAt(i) < (int)wordB.charAt(i)){
                    flag = wordA;
                    break;
                }
                else{
                    flag = wordB;
                    break;
                }
            }
        }
        return flag;
    }
}
