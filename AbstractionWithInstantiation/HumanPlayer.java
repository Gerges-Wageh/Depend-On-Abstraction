package AbstractionWithInstantiation;

public class HumanPlayer implements IPlayer{
    private String symbol;

    @Override
    public void play() {
        System.out.println("Take input position from user then apply it to the board");
    }

    public HumanPlayer(String symbol) {
        this.symbol = symbol;
    }
}
