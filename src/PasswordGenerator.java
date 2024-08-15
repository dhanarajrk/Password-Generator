//This class will act as Back-end to generate password

import java.util.Random;

public class PasswordGenerator{
    
    //Create seperate pools of different characters from where we can take characters to generate password
    public static final String lowercase = "abcdefghijklmnopqrstwxyz";
    public static final String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYS";
    public static final String numbers = "0123456789";
    public static final String symbols = "`!@#$%^&*()_+-={}:|><?[];/";

    //Random class will allow us to generate random characters from the pool
    private final Random random;

    //Constructor to initialize random object
    PasswordGenerator(){
        random = new Random();
    }

    //We will create a new methods that read infos from GUI such as length, uppercase, lowercase, numbers included...etc
    //Thes GUI infos will be passed in the parameters
    public String generatePassword(int length, boolean isUppercase, boolean isLowercase, boolean isNumbers, boolean isSymbols){

        //We will use a Empty String to store all the characters whose toggles are on
        String validCharacters = "";
        if(isUppercase){
            validCharacters += uppercase; //if isUppercase is TRUE, then concatenate all lowercase characters to the validCharacters string
        }
        if(isLowercase){
            validCharacters += lowercase;
        }
        if(isNumbers){
            validCharacters += numbers;
        }
        if(isSymbols){
            validCharacters += symbols;
        }

        //We will use StringBuilder to store generated characters(password) because StringBuilder are more efficient when concatenation is perform
        StringBuilder passwordBuilder = new StringBuilder();

        //Generate a random character from validCharacters for each iterations
        for(int i=0; i<length; i++){

            int randomIndex = random.nextInt(validCharacters.length());  //First we will select a random index from validCharacters.length() (which will return an index from 0 to length-1)

            char randomChar = validCharacters.charAt(randomIndex); //Store that respective random index character 

            passwordBuilder.append(randomChar); //Then append the randomChar to passwordBuilder for each iteration
        }

        //return passwordBuilder as String which is the generated password
        return passwordBuilder.toString();
    }

}

