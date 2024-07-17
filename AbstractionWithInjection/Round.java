package AbstractionWithInjection;

public class Round {
    IPlayer p1;
    IPlayer p2;

    public Round(IPlayer p1, IPlayer p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

}

/*
*   Very elegant, isn't it ?!
*   Now you got rid of conditionals in Player because of abstractions and subtype polymorphism.
*   Now you got rid of conditionals in Round because of dependency injection.
* */