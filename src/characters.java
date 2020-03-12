public class characters extends landboard {

    public int humanatk;
    public int humanhp;
    public int goblinatk;
    public int goblinhp;

    public characters(int humanhp, int humanatk, String[][]board, int goblinhp, int goblinatk){
        this.humanatk = humanatk;
        this.humanhp = humanhp;
        this.board = board;
        this.goblinatk = goblinatk;
        this.goblinhp = goblinhp;
    }


    public String toString(){
        return ("hp:" + humanhp + " || atk:" + humanatk);
    }
    public String toString2(){
        return ("hp:" + goblinhp + " || atk:" + goblinatk);
    }

    //call this on
    public boolean combat(int humanhp, int humanatk, int goblinhp, int goblinatk, boolean isgameover){
        while(humanhp != 0 || goblinhp != 0){               //combat has em fight till one hits 0
            goblinhp = goblinhp - humanatk;
            if(goblinhp <= 0){
                System.out.println("Game Won");
                isgameover = true;
            }
            humanhp = humanhp - goblinatk;
            if(humanhp <= 0){
                System.out.println("Game Loss");
                isgameover = true;
            }


        }
        return isgameover;
    }



}
