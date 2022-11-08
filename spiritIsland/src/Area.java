package src;
import java.util.*;

import src.Invaders.Invader;
public class Area {
    private ArrayList<Invader> invaderList = new ArrayList<Invader>();
    private ArrayList<Native> nativeList = new ArrayList<Native>();
    private String type;
    private int number;
    private boolean isNativesPresent;
    private boolean isInvadersPresent;
    private int presence;
    private boolean holySite = false;
    private int blightLevel;
    private boolean protection;
    private int shieldPoints;
    // generate list to store invader types on area
    // generate method that calculates invader damage
    public void setIsNativesPresent() {
        if(nativeList.size() > 0) {
            this.isNativesPresent = true;
        }
    }
    public boolean getIsNativesPresent() {
        return this.isNativesPresent;
    }
    public boolean getIsInvadersPresent() {
        return this.isInvadersPresent;
    }

    public void setIsIndaversPresent() {
        if(invaderList.size() > 0) {
            this.isInvadersPresent = true;
        }
    }
    
    public ArrayList<Native> getNativeList() {
        return this.nativeList;
    }

    public void setNativeList(ArrayList<Native> nativeList) {
        this.nativeList = nativeList;
    }

    public int getPresence() {
        return this.presence;
    }

    public void setPresence(int presence) {
        this.presence = presence;
    }

    public boolean isHolySite() {
        return this.holySite;
    }

    public boolean getHolySite() {
        return this.holySite;
    }

    public void setHolySite(boolean holySite) {
        this.holySite = holySite;
    }

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
    public boolean isProtected() {
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

    public int getBlightLevel() {
        return this.blightLevel;
    }

    public void setBlightLevel(int blightLevel) {
        this.blightLevel = blightLevel;
    }
    public void attackPhase(int addedSpiritPower) {
        
        }
        

}
