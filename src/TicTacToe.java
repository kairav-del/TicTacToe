public class TicTacToe {
    private int turn;
    private boolean gameEnded = false;
    private String userName;
    private String[][] board = {

                {"-","-","-"},
                {"-","-","-"},
                {"-","-","-"}

        };

        TicTacToe(){
            turn = 2;
            userName = "coolPlayer123";
        }

        TicTacToe(int turn, String userName){
            this.turn = turn;
            this.userName = userName;
        }

        public int getTurn()
        {
            return turn;
        }
        public void setTurnValue(int turn){
            this.turn = turn;
        }
        public String getUserName(){return userName;}
        public void setUserName(String userName){
            this.userName = userName;
        }

        public boolean getGameStatus(){
            return gameEnded;
        }

        public void printBoard()
        {
            System.out.println("  0 1 2");
            //The board values are printed along with grip numbers to help people understand what numbers represent what position

            System.out.print("0 ");
            for(int i = 0; i < board[0].length; i++){
                System.out.print(board[0][i] + " ");
            }

            System.out.println();

            System.out.print("1 ");
            for(int i = 0; i < board[1].length; i++){
                System.out.print(board[1][i] + " ");
            }

            System.out.println();

            System.out.print("2 ");
            for(int i = 0; i < board[2].length; i++){
                System.out.print(board[2][i] + " ");
            }

            System.out.println();
        }


        public boolean pickLocation(int row, int col)
        {

            if(((row < 3 && row >= 0) && (col < 3 && col >= 0)) && board[row][col].equals("-")){
                //checks if the values are within the range of 0 and 2 and is empty.
                return true;
            }
            else{
                return false;
            }



        }

        public void takeTurn(int row, int col)
        {
            if(turn % 2 == 0){
                board[row][col] = "X";
            }
            else{
                board[row][col] = "O";
            }
            turn++;
        }


        public boolean checkRow()
        {

            for(int i = 0; i < 3; i++){
                boolean check = true;

                for(int j = 0; j < 3; j++){
                    if(board[i][0] != board[i][j]){
                        check = false;
                    }
                }

                if(check){
                    return true;
                }
            }

            return false;

        }


        public boolean checkCol()
        {
            for(int i = 0; i < 3; i++){
                boolean check = true;

                for(int j = 0; j < 3; j++){
                    if(board[j][0] != board[j][i]){
                        check = false;
                    }
                }

                if(check){
                    return true;
                }
            }

            return false;
        }

        public boolean checkDiag()
        {
            if(board[0][0] == "O" && board[1][1] == "O" && board[2][2] == "O"){
                //System.out.println("Player Won");
                return true;
            }
            else if(board[2][0] == "O" && board[1][1] == "O" && board[2][0] == "O"){
                //System.out.println("Player Won");
                return true;
            }

            else if(board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X"){
                //System.out.println("Computer Won");
                return true;
            }

            else if(board[2][0] == "X" && board[1][1] == "X" && board[2][0] == "X"){
                //System.out.println("Computer Won");
                return true;
            }
            else{
                return false;
            }


        }

        public boolean checkWin()
        {
            if(checkDiag() || checkCol() || checkRow()){
                gameEnded = true;
            }
            else{
                return false;
            }

            return false;
        }

        public boolean boardFilled(){

            //Initially the game continues (even though it's set as false), it'll end if all the squares are filled. Which is the "!gameEnded" line.
            boolean boardFilled = false;

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {

                    if(board[i][j].equals("-")) {
                        boardFilled = true;
                    }
                }
            }
            return !boardFilled;
        }

   /*
   public void printWinner(){
       //checks if turn is even or odd, and returns the value.
   }
   */

        public void showcaseGameTutorial(){
            System.out.println("lol");
        }

    }

