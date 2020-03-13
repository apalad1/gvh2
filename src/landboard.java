public class landboard extends gvhgame {
    int max = 4; int min = 0;
    int HumanpositionX = (int)(Math.floor(Math.random() * (max-min)) + min); //generate a random position between 0-9
    int HumanpositionY = (int)(Math.floor(Math.random() * (max-min)) + min);
    int GoblinpositionX = (int)(Math.floor(Math.random() * (max-min)) +min);
    int GoblinpositionY = (int)(Math.floor(Math.random() * (max-min)) +min);



    void initialboard(){
        System.out.print("Initial Human position is " + HumanpositionX + "," + HumanpositionY);
        System.out.println(" || Initial Goblin position is " + GoblinpositionX + "," + GoblinpositionY);
        board[HumanpositionX][HumanpositionY] = "\u03D8";       //human symbol
        board[GoblinpositionX][GoblinpositionY] = "\u0260";     //goblin symbol
    }

    void setBoard(){
        //draft for board fill/update method?
        for(int x=0; x<max+1;x++){
            for(int y=0;y<max+1;y++){
                if(board[x][y] != "\u03D8" && board[x][y] != "\u0260"){
                    board[x][y] = "\u009D";       //land symbol
                }
            }
        }
        printarray(board);
    }

    //if statement to make sure the player move after calculation is within range
    //only execute if it is

    public void printarray(String[][] board){
        System.out.println(board[0][0] + " " + board[1][0] + " " + board[2][0] + " " + board[3][0] + " " + board[4][0]);
        System.out.println(board[0][1] + " " + board[1][1] + " " + board[2][1] + " " + board[3][1] + " " + board[4][1]);
        System.out.println(board[0][2] + " " + board[1][2] + " " + board[2][2] + " " + board[3][2] + " " + board[4][2]);
        System.out.println(board[0][3] + " " + board[1][3] + " " + board[2][3] + " " + board[3][3] + " " + board[4][3]);
        System.out.println(board[0][4] + " " + board[1][4] + " " + board[2][4] + " " + board[3][4] + " " + board[4][4]);
    }

    public void Announce(int humanXcord, int humanYcord){
        System.out.print("Initial Human position is " + humanXcord + "," + humanYcord);

    }


}
