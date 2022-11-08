package src.Invaders;

// import java.lang.ProcessBuilder.Redirect.Type;

public class Invader {
    private int attackPower;
    private int lifePoints;

    public Invader(int attackPower, int lifePoints) {
        this.attackPower = attackPower;
        this.lifePoints = lifePoints;
    }
    public int getAttackPower() {
        return this.attackPower;
    }
    public int getLifePoints(){
        return this.lifePoints;
    }
    public void damageTaken(int damage) {
        this.lifePoints -= damage;
        
    }
   
    
}
