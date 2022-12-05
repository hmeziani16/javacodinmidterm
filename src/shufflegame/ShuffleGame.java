package shufflegame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleGame implements GameRoadMap{



    Scanner scanner = new Scanner(System.in);
    int input;
    String inputSc;


    int[] array = {1, 0 ,1};

    public void welcome (){
        System.out.println("----------------------------------welcome to shuffle game-------------------------------");
        System.out.println("guess where the 0 is ?");
        System.out.println("are you ready to play? y/n");


    }
    public void selection () {

            inputSc = scanner.nextLine();
            if (inputSc.equalsIgnoreCase("y")){

                playerGuess();
            } else if (inputSc.equalsIgnoreCase("n")) {
                System.out.println("see you next time!");
            }else {
            System.out.println("are you ready to play? y/n");
                selection();
            }


        }



    public int[] shuffleGame(int[] array) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }

    /**
     * captures the user input (1, 2 or 3) saves it in an integer variable and returns it
     *
     * @return playerGuess: userInput value
     */
    public int playerGuess() {


        System.out.println("pick 1, 2 or 3! [*, *, *]");

        input = scanner.nextInt();


        return input;
    }

    /**
     * checks whether the player guess position is in a correct position in the shuffled array or not
     * and prints the corresponding statements
     * @param shuffledArray: takes the shuffled array
     * @param playerGuess: takes the chosen position user input
     */
    public void checkGuess(int[] shuffledArray, int playerGuess) {

       // shuffleGame(array);


        if(input == 1){

            if (shuffledArray[0]== 0 ) {
                System.out.println("good guess!"+ Arrays.toString(shuffledArray));
                //anOtherTry();
            }else System.out.println("sorry!!! wrong guess!"+ Arrays.toString(shuffledArray));
            //anOtherTry();

        }

       else if(playerGuess==2){

            if (shuffledArray[1]==0){
                System.out.println("good guess!"+ Arrays.toString(shuffledArray));
                //anOtherTry();
            }else System.out.println("sorry!!! wrong guess!"+ Arrays.toString(shuffledArray));
            //anOtherTry();

        }

       else if(playerGuess==3){

            if (shuffledArray[2]==0){
                System.out.println("good guess!"+ Arrays.toString(shuffledArray));
                //anOtherTry();
            }else
                System.out.println("sorry!!! wrong guess!"+ Arrays.toString(shuffledArray));
            //anOtherTry();


       }
       else {
           System.out.println("pick 1, 2 ?or 3! [*, *, *]");


        }//anOtherTry();



    }

    void anOtherTry(){

       System.out.println("Do you want to try again? y/n");

        inputSc = scanner.nextLine();
        if (inputSc.equalsIgnoreCase("y")){

            playerGuess();
            checkGuess(shuffleGame(array),input);
            anOtherTry();




        } else if (inputSc.equalsIgnoreCase("n")) {
            System.out.println("see you next time!");

        }else {
            anOtherTry();

        }

    }

    public void play() {
        welcome();
        selection();

        checkGuess(shuffleGame(array),input);

        anOtherTry();






    }

}
