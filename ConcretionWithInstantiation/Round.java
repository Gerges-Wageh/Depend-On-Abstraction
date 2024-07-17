package ConcretionWithInstantiation;

public class Round {
    private Player p1;
    private Player p2;

    public Round(String P1Symbol, boolean P1IsHuman, String P2Symbol, Boolean P2IsHuman){
        p1 = new Player(P1Symbol, P1IsHuman);
        p2 = new Player(P2Symbol, P2IsHuman);

    }
}


 /*
 Notice that with this way there are 2 bad design effects:
    1) the instantiation in Round class puts responsibility to the class for instantiation other object
       Assume many classes uses Player that way, you have to duplicate the constructor parameter.
       For any reason if the constructor of Player is changed or modified you have to modify this
       in all classes that depend on Player and instantiate it internally.

    2) Depending on concretion forced you to use conditionals for behavioral variation in Player
            (Computer player behavior and Human player behavior)

*/