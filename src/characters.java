public class characters extends landboard {

    public int atk;
    public int hp;

    public characters(int atk, int hp, String[][]board){
        this.atk = atk;
        this.hp = hp;
        this.board = board;
    }


    public String toString(){
        return ("hp:" + hp + " || atk:" + atk);
    }



}
