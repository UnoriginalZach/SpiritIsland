package src;
// all game state
public class InvaderBoard {
    private int fearPool = 20;
    private int fearGenerated = 0;
    private int terrorLevel = 1;
    
    public void generateFear(int fear) {
        this.fearPool -= fear;
        this.fearGenerated += fear;
    }
    
}
