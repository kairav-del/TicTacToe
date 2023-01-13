import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

    Scanner scanner = new Scanner(System.in);

    TicTacToe game = new TicTacToe(3,"Kairav");

    /*
    System.out.println("Skip introduction and jump straight to the game? (Y or N)");
    String skipPrelude = scanner.nextLine();

    boolean continueAsking = true;
    while (continueAsking) {
        if (skipPrelude.equals("y") || skipPrelude.equals("yes") || skipPrelude.equals("Y") || skipPrelude.equals("Yes")) {
            continueAsking = false;
        } else if (skipPrelude.equals("n") || skipPrelude.equals("no") || skipPrelude.equals("N") || skipPrelude.equals("No")) {
            System.out.println("Buckle up your seatbealts to have fun!");
            continueAsking = false;
        } else {
            System.out.println("Sorry, invalid output. Try again!");
            System.out.println("Skip introduction and jump straight to the game? (Y or N)");
            String temp = scanner.nextLine();
            skipPrelude = temp;
            }
        }

        System.out.println("\r");

        System.out.println("Welcome Player! \nBefore we kick off the game, we'll need to set your name and choose who goes first. \n");
        System.out.println("First of all, what should we call you?");

        //check if the user will want to go first or second. First would imply that "turn" is an even number. we'll ask more questions later on

        String userNameInput = scanner.nextLine();
        TicTacToe game = new TicTacToe(2, userNameInput);

        System.out.println("Got it " + game.getUserName() + "! Would you like an intro on how the game works? (Y or N)");
        String tutorialYesOrNo = scanner.nextLine();

        boolean continueAskingAnother = true;

        while (continueAskingAnother) {
            if (tutorialYesOrNo.equals("y") || tutorialYesOrNo.equals("yes") || tutorialYesOrNo.equals("Y") || tutorialYesOrNo.equals("Yes")){
                continueAskingAnother = false;
                game.showcaseGameTutorial();
            } else if (tutorialYesOrNo.equals("n") || tutorialYesOrNo.equals("no") || tutorialYesOrNo.equals("N") || tutorialYesOrNo.equals("No")){
                continueAskingAnother = false;
                System.out.println("Alright! Enough chitchat, let's start. ");
            } else {
                System.out.println("Sorry, invalid output. Try again!");
                System.out.println("Got it " + game.getUserName() + "! Would you like an intro on how the game works? (Y or N)");
                String temp = scanner.nextLine();
                tutorialYesOrNo = temp;
            }
        }


     */

        while(!game.getGameStatus()){

            if(game.boardFilled()){
                System.out.println("Board Filled! ");
                System.exit(0);
            }

            game.printBoard();
            System.out.println("Enter the row: ");
            int rowInput = scanner.nextInt();
            System.out.println("Enter the colum: ");
            int columInput = scanner.nextInt();



            if(game.pickLocation(rowInput, columInput)){

                game.takeTurn(rowInput, columInput);
            }

            if(game.checkWin()){
                System.out.println("We have a winner!");
                System.exit(0);
            }


        }




    }
}
