package ConcretionWithInjection;


public class Round {
    private Player p1;
    private Player p2;

    public Round(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

}


/*
*   Now you have solved one problem which is the Instantiation headache,
*   But the other is still exist which is the conditionals in Player for
*   behavioral variations.
* */