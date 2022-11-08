package src;
import java.util.*;
public class Area {
    private ArrayList<Invader> invaderList = new ArrayList<Invader>();
    private String type;
    private int number;
    private int presentNatives;
    private int presentInvaders;
    private int presenceLevel;
    private int blightLevel;
    private boolean protection;
    private int shieldPoints;
    // generate list to store invader types on area
    // generate method that calculates invader damage

    
    public Invader getInvaders() {
        for(int i = 0; i < invaderList.size(); i++) {
            if(invaderList.size() != 0) {
                return invaderList.get(i);
            }
            
        }
        return null;
    }

    public void addInvader(Invader invader) {
        this.invaderList.add(invader);
    }
    public boolean isProtection() {
        return this.protection;
    }

    public boolean getProtection() {
        return this.protection;
    }

    public void setProtection(boolean protection) {
        this.protection = protection;
    }

    public int getShieldPoints() {
        return this.shieldPoints;
    }

    public void setShieldPoints(int shieldPoints) {
        this.shieldPoints = shieldPoints;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPresentNatives() {
        return this.presentNatives;
    }

    public void setPresentNatives(int presentNatives) {
        this.presentNatives = presentNatives;
    }

    public int getPresentInvaders() {
        return this.presentInvaders;
    }

    public void setPresentInvaders(int presentInvaders) {
        this.presentInvaders = presentInvaders;
    }
    public void setPresenceLevel(int presenceLevel) {
        this.presenceLevel = presenceLevel;
    }
    public int getPresenceLevel(int presenceLevel) {
        return this.presenceLevel;
    }
    
    public int getBlightLevel() {
        return this.blightLevel;
    }

    public void setBlightLevel(int blightLevel) {
        this.blightLevel = blightLevel;
    }
    public void attackPhase(int addedSpiritPower) {
        int totalPower = this.presentNatives + addedSpiritPower;
        this.presentInvaders = this.presentInvaders - totalPower;
        if(this.presentInvaders < 0) {
            this.presentInvaders = 0;
        }
        if(!protection){
        this.presentNatives = this.presentNatives - this.presentInvaders;
        if(presentNatives < 0) {
            this.presentNatives = 0;
            this.blightLevel += 1;
        }
        }
        
        
    }

}
