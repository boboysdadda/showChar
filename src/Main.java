import java.util.Scanner;

/**
 * Created by James Dreier on 10/15/2015.
 */
public class Main {
    public static void main(String[] args) {

        Scanner City = new Scanner(System.in);  //creates first scanner instance
        System.out.println("Please enter a City");
        String inputCity = City.nextLine(); //Gets the city input
        Scanner number = new Scanner(System.in);    //creates second scanner instance
        System.out.println("Please enter a number within the number of characters for that city");
        System.out.println("Counting from 1 not 0");
        int inputNumber = number.nextInt(); //Gets the number input
        number.nextLine(); //consumes next line just in case
        showChar(inputCity,inputNumber); //calls the showChar method
    }
    public static void showChar(String character, int position){
        char letter = character.charAt(position - 1);   // takes a the number at the real count starting
                                                        // at 1 instead of the count starting at 0
        System.out.println("the character at position "+position + " is: "+letter );


    }
}
