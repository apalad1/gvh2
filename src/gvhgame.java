import java.util.HashMap;
import java.util.Scanner;

public class gvhgame {

    public static String[][] board = new String[4][4];

    public static void main(String[]args){
        landboard land = new landboard();
        land.initialboard();                //call out the initial state of the board
        land.setBoard();


        Human hplayer = new Human(2,3, board);     //sets hplayer stats
        hplayer.setatk();
        System.out.println(hplayer.toString());

        landboard landy = new landboard();


        System.out.println("wasd to move");
        hplayer.movement(board);
        System.out.println(hplayer.toString());
    }

}
