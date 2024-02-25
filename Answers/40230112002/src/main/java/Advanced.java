import javax.naming.Name;
import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
        String[] wordArr = new String[sentence.split(" ").length];
        wordArr = sentence.split(" ");

        int i = 0;
        for (String eachWord : wordArr) {
            if(eachWord.equals(word)){
                wordArr[i] = newWord;
                break;
            }
            i++;
        }
        sentence = String.join(" " , wordArr);
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
        lastName = lastName.toLowerCase();

        String[] FirstAlph = new String[firstName.split("").length];
        String[] LastAlph = new String[lastName.split(("")).length];

        FirstAlph = firstName.split("");
        LastAlph = lastName.split("");

        FirstAlph[0] = FirstAlph[0].toUpperCase();
        LastAlph[0] = LastAlph[0].toUpperCase();

        if(lastName.equals(" ") || firstName.equals(" ") || lastName.equals("") || firstName.equals("") ){
            String Name = String.join("" , FirstAlph) + String.join("" , LastAlph);
            return Name.trim();
        }
        String Name = String.join("" , FirstAlph) + " " + String.join("" , LastAlph);
        return Name;
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        String[] name = new String[word.split("").length];
        name = word.split("");
        int i = 0 , j = 0;
        for(String each : name){
            for(j = i+1 ; j<name.length ; j++){
                if(name[i].equals(name[j])){
                    name[i] = "";
                }
                else{
                    i++;
                    break;
                }
            }
        }


//        String first = name[0];
//        String last = name[1];
//
//        String[] firstname = new String[first.split("").length];
//        String[] lastname = new String[last.split("").length];
//
//        firstname = first.split("");
//        lastname = last.split("");
//
//
//
//        int i = 0;
//        int j = 0;
//        for(String eachAl : firstname){
//
//            for(j = i+1 ; j<firstname.length ; j++){
//                if(firstname[i].equals(firstname[j])){
//                    firstname[j]="";
//                }
//            }
//            i++;
//        }
//
//        i=0;
//        j=0;
//
//        for(String eachAl : lastname){
//
//            for(j = i+1 ; j<lastname.length ; j++){
//                if(lastname[i].equals(lastname[j])){
//                    lastname[j]="";
//                }
//            }
//            i++;
//        }
//        String fullname = String.join("" , firstname)+" "+ String.join("" , lastname);
//        return fullname ;
        return String.join("" , name);
    }
}

