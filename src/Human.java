import java.util.Scanner;

public class Human extends characters{

    public int humanXcord;
    public int humanYcord;
    public String playername;
    public Human(int hp, int atk, String[][]board){
        super(hp, atk, board);
        //scanner to take in playername
        playername = "ap";
    }
    public int setatk(int a){
        this.atk = a;
        return atk;
    }
    public int sethp(int b){
        this.hp = b;
        return hp;
    }                                                                   //"\u03D8"       //human symbol
                                                                        //"\u0260"     //goblin symbol
                                                                        //"\u009D"       //land symbol
    public String[][] movement(String[][]board){
        //scanner for the input w, a, s, d
        Scanner scanthing = new Scanner(System.in);
        String playermove = scanthing.nextLine();

        //take the current position of the human in the board
        for(int x=0; x<max+1;x++){
            for(int y=0;y<max+1;y++){
                if(board[x][y] != "\u009D" && board[x][y] != "\u0260"){
                    humanXcord = x;
                    humanYcord = y;
                }
            }
        }


        switch(playermove){
            case "w": //going up
                System.out.println("player -" + playername + "- moves UP to position " +  humanXcord + "," + humanYcord + " ---------------"); //move announcement
                if(humanYcord != min){
                    //if theres a goblin on this supposed coordinate, make em fight
                     if(board[humanXcord][humanYcord-1] == "\u0260"){
                         overlap();
                     }
                    board[humanXcord][humanYcord]= "\u009D"; //replace previous human with land
                    humanYcord -=1;                        //if its the other way " =-1 thats setting it to -1

                    board[humanXcord][humanYcord] = "\u03D8"; // replace previous land with human

                }
                super.printarray(board);
                return board;

            case "s": //going down
                if(humanYcord != max){
                    //if theres a goblin on this supposed coordinate, make em fight
                     if(board[humanXcord][humanYcord+1] == "\u0260"){
                       overlap();
                    }
                    board[humanXcord][humanYcord]= "\u009D"; //replace previous human with land
                    humanYcord +=1;                        //if its the other way " =-1 thats setting it to -1

                    board[humanXcord][humanYcord] = "\u03D8"; // replace previous land with human
                    System.out.println("player -" + playername + "- moves DOWN to position " +  humanXcord + "," + humanYcord + " ---------------"); //move announcement


                }
                super.printarray(board);
                return board;

            case "a": //going left
                if(humanXcord != min){
                    //if theres a goblin on this supposed coordinate, make em fight
                    if(board[humanXcord-1][humanYcord] == "\u0260"){
                       overlap();
                     }
                board[humanXcord][humanYcord]= "\u009D"; //replace previous human with land
                humanXcord -=1;                        //if its the other way " =-1 thats setting it to -1

                board[humanXcord][humanYcord] = "\u03D8"; // replace previous land with human
                System.out.println("player -" + playername + "- moves LEFT to position " +  humanXcord + "," + humanYcord + " ---------------"); //move announcement


            }
            super.printarray(board);
            return board;

            case "d": //going right
                if(humanXcord != max){
                    //if theres a goblin on this supposed coordinate, make em fight
                     if(board[humanXcord+1][humanYcord] == "\u0260"){
                       overlap();
                     }
                    board[humanXcord][humanYcord]= "\u009D"; //replace previous human with land
                    humanXcord +=1;                        //if its the other way " =-1 thats setting it to -1

                    board[humanXcord][humanYcord] = "\u03D8"; // replace previous land with human
                    System.out.println("player -" + playername + "- moves RIGHT to position " +  humanXcord + "," + humanYcord + " ---------------"); //move announcement


                }
                super.printarray(board);
                return board;

            default:
                return board;
        }

    }
    //a method to be called to check if the human will overlap with the goblin
    public boolean overlap(){
        super.combat();
        //run through the board, replace GOBL tile with land
        if(hhp <= 0){
            isgameover = true;
        }
        return isgameover;
    }

    ///////////////////////////
    @Override
    public String toString(){
        return ("player -" + playername + "- has hp:" + hhp + " || atk:" + hatk );
    }
   // @Override  calling the superclass from landboard does this
   // public void printarray(String[][] board){
   // }
}