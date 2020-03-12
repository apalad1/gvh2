import java.util.HashMap;
import java.util.Scanner;

public class gvhgame {

    public static String[][] board = new String[4][4];
    public static boolean isgameover = false;

    public static void main(String[]args){
        landboard land = new landboard();
        land.initialboard();                //call out the initial state of the board
        land.setBoard();


        Human hplayer = new Human(3,2, board, 2, 1);     //sets hplayer stats
        hplayer.setatk();


        Goblin gobbles = new Goblin(3,2, board, 2, 1);
        //while(isgameover == false) {

            for(int testturns = 0; testturns < 5; testturns++){     //run it 5 times just to test, should be while game is up
            System.out.println("wasd to move");                 //on actual just use boolean isgamewon = false to keep it
            hplayer.movement(board);
            System.out.println(hplayer.toString());
            System.out.println(gobbles.toString());
            }

        //}


    }

}
