package src;
public class Native {
    private int attackPoints = 2;
    private int lifePoints = 2;
    private int shieldPoints;

    public int getLifePoints() {
        return this.lifePoints;
    }
    public int getAttackPoints() {
        return this.attackPoints;
    }
    public void setShieldPoints(int shieldPoints) {
        this.shieldPoints = shieldPoints;
    }
    public int getShieldPoints() {
        return this.shieldPoints;
    }

    public void damageTaken(int damage) {
        this.lifePoints -= damage;
    }
}
