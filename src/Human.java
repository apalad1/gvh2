import java.util.Scanner;

public class Human extends characters{
    public int humanXcord;
    public int humanYcord;
    public String playername;
    public Human(int atk, int hp, String[][]board){
        super(atk, hp, board);
        //scanner to take in playername
        playername = "ap";
    }
    public void setatk(){
        atk = 3;
    }
    //movement method - atm it just sets position0,0 to "huma"
    //then returns it
    public String[][] movement(String[][]board){
        //scanner for the input w, a, s, d
        Scanner scanthing = new Scanner(System.in);
        String playermove = scanthing.nextLine();

        //take the current position of the human in the board
        //take the current position of the human in the board

        for(int x=0; x<max+1;x++){
            for(int y=0;y<max+1;y++){
                if(board[x][y] != "Land" && board[x][y] != "GOBL"){
                    humanXcord = x;
                    humanYcord = y;
                }
            }
        }

        switch(playermove){
            case "w":

                if(humanYcord != 0){
                    board[humanXcord][humanYcord]= "Land"; //replace previous human with land
                    humanYcord -=1;                        //if its the other way " =-1 thats setting it to -1
                    board[humanXcord][humanYcord] = "HUMA"; // replace previous land with human
                    System.out.println("player -" + playername + "- moves UP to position " +  humanXcord + "," + humanYcord); //move announcement


                }
                printarray(board);
                return board;



            default:
                return board;
        }

    }



    ///////////////////////////
    @Override
    public String toString(){
        return ("player -" + playername + "- has: " + super.toString() );
    }
    @Override
    public void printarray(String[][] board){
        System.out.println(board[0][0] + " " + board[1][0] + " " + board[2][0] + " " + board[3][0]);
        System.out.println(board[0][1] + " " + board[1][1] + " " + board[2][1] + " " + board[3][1]);
        System.out.println(board[0][2] + " " + board[1][2] + " " + board[2][2] + " " + board[3][2]);
        System.out.println(board[0][3] + " " + board[1][3] + " " + board[2][3] + " " + board[3][3]);
    }
}
