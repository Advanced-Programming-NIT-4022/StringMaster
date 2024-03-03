public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] words = sentence.split("\\s+");
        int l = words.length;

        if (number > l) {
            String x = "Number = ";
            String y = String.valueOf(number);
            String z = " is out Of Bound";
            String EROR = x+y+z ;
            return EROR;
        }
        return words[number - 1];
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        int even=0,odd=0;
        int n = Integer.parseInt((number));
        while(n > 0){
            if((n%10)%2 == 0){
                even++;
            }else{
                odd++;
            }
            n = n/10;
        }
        if(searchForEven){
            return even;
        }else{
            return odd;
        }
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        int la = wordA.length();
        int lb = wordB.length();
        int l_min;
        String word_min;
        //check kardan inke kodoom kotah tare
        if (la > lb){
            l_min = lb;
            word_min = wordB;
        }else{
            l_min = la;
            word_min = wordA;
        }
        //bray estefade az aski code lowercase kardam
        String A = wordA.toLowerCase();
        String B = wordB.toLowerCase();
        Boolean check = true;
        for (int i=0; i<l_min; i++){
            if ((int)wordA.charAt(i) < (int)wordB.charAt(i)){
                check = false;
                A = A.substring(0,1).toUpperCase() + A.substring(1);
                return wordA;
            } else if ((int)A.charAt(i) > (int)B.charAt(i)) {
            check = false;
                B = B.substring(0,1).toUpperCase() + B.substring(1);
                return wordB;
            }
        }
        if (check){
            word_min = word_min.substring(0,1).toUpperCase() + word_min.substring(1);
            return word_min;
        }
        return null;
    }
}
