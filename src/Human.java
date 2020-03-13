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
    }


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
                    board[humanXcord][humanYcord]= "\u009D"; //replace previous human with land
                    humanYcord -=1;                        //if its the other way " =-1 thats setting it to -1

                    //if theres a goblin on this supposed coordinate, make em fight
                    //if(board[humanXcord][humanYcord-1] == "GOBL"){
                        overlap();
                   // }

                    board[humanXcord][humanYcord] = "\u03D8"; // replace previous land with human

                }
                printarray(board);
                return board;

            case "s": //going down
                if(humanYcord != max){
                    board[humanXcord][humanYcord]= "\u009D"; //replace previous human with land
                    humanYcord +=1;                        //if its the other way " =-1 thats setting it to -1

                    //if theres a goblin on this supposed coordinate, make em fight
                   // if(board[humanXcord][humanYcord+1] == "GOBL"){
                     //   overlap();
                    //}

                    board[humanXcord][humanYcord] = "\u03D8"; // replace previous land with human
                    System.out.println("player -" + playername + "- moves DOWN to position " +  humanXcord + "," + humanYcord + " ---------------"); //move announcement


                }
                printarray(board);
                return board;

            case "a": //going left
                if(humanXcord != min){
                board[humanXcord][humanYcord]= "\u009D"; //replace previous human with land
                humanXcord -=1;                        //if its the other way " =-1 thats setting it to -1

                    //if theres a goblin on this supposed coordinate, make em fight
                    //if(board[humanXcord-1][humanYcord] == "GOBL"){
                     //   overlap();
                   // }
                board[humanXcord][humanYcord] = "\u03D8"; // replace previous land with human
                System.out.println("player -" + playername + "- moves LEFT to position " +  humanXcord + "," + humanYcord + " ---------------"); //move announcement


            }
            printarray(board);
            return board;

            case "d": //going right
                if(humanXcord != max){
                    board[humanXcord][humanYcord]= "\u009D"; //replace previous human with land
                    humanXcord +=1;                        //if its the other way " =-1 thats setting it to -1

                    //if theres a goblin on this supposed coordinate, make em fight
                   // if(board[humanXcord+1][humanYcord] == "GOBL"){
                     //   overlap();
                   // }

                    board[humanXcord][humanYcord] = "\u03D8"; // replace previous land with human
                    System.out.println("player -" + playername + "- moves RIGHT to position " +  humanXcord + "," + humanYcord + " ---------------"); //move announcement


                }
                printarray(board);
                return board;

            default:
                return board;
        }

    }
    //a method to be called to check if the human will overlap with the goblin
    public boolean overlap(){
        super.combat();
        //System.out.println("after super"); still goes here
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
    @Override
    public void printarray(String[][] board){
        System.out.println(board[0][0] + " " + board[1][0] + " " + board[2][0] + " " + board[3][0] + " " + board[4][0]);
        System.out.println(board[0][1] + " " + board[1][1] + " " + board[2][1] + " " + board[3][1] + " " + board[4][1]);
        System.out.println(board[0][2] + " " + board[1][2] + " " + board[2][2] + " " + board[3][2] + " " + board[4][2]);
        System.out.println(board[0][3] + " " + board[1][3] + " " + board[2][3] + " " + board[3][3] + " " + board[4][3]);
        System.out.println(board[0][4] + " " + board[1][4] + " " + board[2][4] + " " + board[3][4] + " " + board[4][4]);
    }
}