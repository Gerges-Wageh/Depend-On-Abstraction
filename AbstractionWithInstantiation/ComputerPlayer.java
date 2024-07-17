package AbstractionWithInstantiation;

public class ComputerPlayer implements IPlayer{
    private String symbol;

    @Override
    public void play() {
        System.out.println("Don't take input from user but apply suitable algorithm for playing");
    }

    public ComputerPlayer(String symbol) {
        this.symbol = symbol;
    }
}
