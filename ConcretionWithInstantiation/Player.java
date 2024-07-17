package ConcretionWithInstantiation;

public class Player {
    private String symbol;
    private boolean isHuman;

    public Player(String symbol, boolean isHuman) {
        this.symbol = symbol;
        this.isHuman = isHuman;
    }

    public void play(){
        if (isHuman){
            System.out.println("Take input position from user then apply it to the board");
        }else {
            System.out.println("Don't take input from user but apply suitable algorithm for playing");
        }
    }
}
