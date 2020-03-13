public class characters extends landboard {

    public int atk;                //have a base 'atk' and 'hp stat in the characters class
    public int hp;                 //have the human set that atk equal to its humanatk var thats in the human class
                                        //same with goblin


    public characters(int hp, int atk, String[][]board){
        this.hp = hp;
        this.atk = atk;
        this.board = board;

    }


    public String toString(){
        return ("hp:" + hp + " || atk:" + atk);
    }

    //think this would work for multiple goblins if they all have the same stats just dif names to show which goblin on the board is removed
    public int combat(){
        hhp = hhp - gatk;
        //ghp = ghp - hatk; loop the fight till one of em hits 0
        //if hhp <= 0 -> isgameover = true ; print "game loss"
        //else if ghp <=0 -> locate the board with 'GOBL'replace it with land or replace it with a respawn?
        System.out.println("*** hp left after combat " + hhp + " ***");
        return hhp;
    }




}
