package AbstractionWithInstantiation;

public class Round {

    IPlayer p1;
    IPlayer p2;

    public Round(String P1Symbol, boolean P1IsHuman, String P2Symbol, boolean P2IsHuman){
        if(P1IsHuman){
            p1 = new HumanPlayer(P1Symbol);
        }else{
            p1 = new ComputerPlayer(P1Symbol);
        }
        if (P2IsHuman){
            p2 = new ComputerPlayer(P2Symbol);
        }else {
            p2 = new ComputerPlayer(P2Symbol);
        }
    }
}

/*
*   Notice how the depending on abstraction helps you get rid of conditionals in Player,
*   But this forward the conditionals to Round because you still preserve the instantiation approach.
*
* */