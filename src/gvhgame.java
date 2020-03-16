import java.util.HashMap;
import java.util.Scanner;

public class gvhgame {

    public static String[][] board = new String[5][5];
    public static boolean isgameover = false;
    public static int hatk;
    public static int hhp;
    public static int gatk;
    public static int ghp;

    public static void main(String[]args){
        System.out.println("WELCOME TO THE GAME, ENTER YOUR PLAYER NAME");
        landboard land = new landboard();
        land.initialboard();                //call out the initial state of the board
        land.setBoard();


        Human hplayer = new Human(1,1, board);     //sets hplayer stats
        hatk = hplayer.setatk(100);  //applies vs everything else
        hhp = hplayer.sethp(100);

        Goblin gobbles = new Goblin(1,1, board);
        gatk = gobbles.setatk(5);
        ghp = gobbles.sethp(5);




        while(isgameover == false) {
            System.out.println("wasd to move");
            gobbles.catchme(board);
            hplayer.movement(board);
            System.out.println(hplayer.toString());
            System.out.println(gobbles.toString());

        }


    }

}
