import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

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

        System.out.println("Welcome Player! \nBefore we kick off the game, we'll need to set your name and choose who goes first. \n");
        System.out.println("First of all, what should we call you?");
        String userNameInput = scanner.nextLine();
        TicTacToe game = new TicTacToe(2, userNameInput);

        System.out.println("Got it " + game.getUserName() + " ! Would you like an intro on how the game works? (Y or N)");
        String tutorialYesOrNo = scanner.nextLine();

        boolean continueAskingAnother = true;

        while (continueAskingAnother) {
            if (tutorialYesOrNo == "y" || tutorialYesOrNo == "yes" || tutorialYesOrNo == "Y" || tutorialYesOrNo == "Yes") {
                continueAskingAnother = false;
                game.showcaseGameTutorial();
            } else if (tutorialYesOrNo == "n" || tutorialYesOrNo == "no" || tutorialYesOrNo.equals("N") || tutorialYesOrNo == "No") {
                continueAskingAnother = false;
                System.out.println("Alright! Enough chitchat, let's start. ");
            } else {
                System.out.println("Sorry, invalid output. Try again!");
            }
        }
    }
}
/*
        int array[] = {4,3,5,6,4,0,9,5,1};

        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+ 1; j < array.length; j++) {
                if(array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        System.out.println(Arrays.toString(array));



        /*for(int i : array)
        {
            System.out.print(i);
        }
         */