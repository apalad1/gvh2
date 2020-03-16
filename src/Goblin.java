public class Goblin extends characters {


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

    @Override
    public String toString(){
        return ("goblin has " + super.toString());
    }
}
