public class Goblin extends characters {


    public Goblin(int humanhp, int humanatk, String[][] board, int goblinhp, int goblinatk) {
        super(humanhp, humanatk, board, goblinhp, goblinatk);
    }
    //- locate players position
    //- simple move towards player, till x and y are the same
    //^ x coord first then y coord

    @Override
    public String toString(){
        return ("gobbles has " + super.toString2() );
    }
}
