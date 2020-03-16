public class Goblin extends characters {

    public int goblinXcord;
    public int goblinYcord;
    public boolean goblinexists = false;

    public Goblin(int hp, int atk, String[][] board) {
        super(hp, atk, board);
    }
    public int setatk(int c){
        this.atk = c;
        return atk;
    }
    public int sethp(int d){
        this.hp = d;
        return hp;
    }
    //- locate players position
    //- simple move towards player, till x and y are the same
    //^ x coord first then y coord

    //have the goblin move either sideways or updown 1 tile after playermoves
    public String[][] catchme(String[][]board){
        //take the current position of the goblin in the board
        for(int x=0; x<max+1;x++){
            for(int y=0;y<max+1;y++){
                if(board[x][y] != "\u009D" && board[x][y] != "\u03D8"){     //neither land or human on tile
                    goblinXcord = x;
                    goblinYcord = y;
                    goblinexists = true;
                }
            }
        }
        if(goblinexists == true){

            //set boundaries, move the goblin 1 tile
            //switch case on which 4 directions to move, random should give either 1-up, 2-down, 3-left, 4-right
            int gobmove = (int)(Math.floor(Math.random() * (4-0)) + 0);
            System.out.println(gobmove + " is the gobmove");
            switch(gobmove){
                case 1: //up
                    board[goblinXcord][goblinYcord] = "\u009D"; //turn the goblin space to land
                    if(goblinYcord != min){
                        goblinYcord -=1;
                    } else{
                        goblinYcord +=1;
                    }
                    board[goblinXcord][goblinYcord] = "\u0260";
                    System.out.println("GOBLIN MOVES TO POSITION " + goblinXcord + "," + goblinYcord);
                    break;
                case 2:
                    board[goblinXcord][goblinYcord] = "\u009D"; //turn the goblin space to land
                    if(goblinYcord != max){
                        goblinYcord +=1;
                    } else{
                        goblinYcord -=1;
                    }
                    board[goblinXcord][goblinYcord] = "\u0260";
                    System.out.println("GOBLIN MOVES TO POSITION " + goblinXcord + "," + goblinYcord);
                    break;
                case 3:
                    board[goblinXcord][goblinYcord] = "\u009D"; //turn the goblin space to land
                    if(goblinXcord != min){
                        goblinXcord -=1;
                    } else{
                        goblinXcord +=1;

                    }
                    board[goblinXcord][goblinYcord] = "\u0260";
                    System.out.println("GOBLIN MOVES TO POSITION " + goblinXcord + "," + goblinYcord);
                    break;
                case 4:
                    board[goblinXcord][goblinYcord] = "\u009D"; //turn the goblin space to land
                    if(goblinXcord != max){
                        goblinXcord +=1;
                    } else{
                        goblinXcord -=1;
                    }
                    board[goblinXcord][goblinYcord] = "\u0260";
                    System.out.println("GOBLIN MOVES TO POSITION " + goblinXcord + "," + goblinYcord);
                    break;
                default:
                    break;
            }
        }
        super.printarray(board);
        return board;
    }
    @Override
    public String toString(){
        return ("goblin has " + super.toString());
    }
}
