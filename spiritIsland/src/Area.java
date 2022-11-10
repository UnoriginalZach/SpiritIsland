package src;
import java.util.*;
import java.lang.*;

import src.Invaders.Invader;
public class Area {
    private ArrayList<Invader> invaderList = new ArrayList<Invader>();
    private ArrayList<Native> nativeList = new ArrayList<Native>();
    private String type;
    private int number;
    private int presence;
    private boolean holySite;
    private int blightLevel;
    private boolean protection;
    private int shieldPoints;
    // generate method that calculates invader damage
    public boolean isNativesPresent() {
        if(nativeList.size() > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isIndaversPresent() {
        if(invaderList.size() > 0) {
            return true;
        }
        else {
            return false;
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
    public int getTotalInvaderPower() {
        int totalPower = 0;
        for(int i = 0; i < invaderList.size(); i++) {
            if(invaderList.size() != 0) {
                Invader currentInvader = invaderList.get(i);
                totalPower += currentInvader.getAttackPower();
            }
            
        }
        return totalPower;
    }

    public int getTotalNativePower() {
        int totalPower = 0;
        for(int i = 0; i < nativeList.size(); i++) {
            if(nativeList.size() != 0) {
                Native currentNative = nativeList.get(i);
                totalPower += currentNative.getAttackPower();
            }
            
        }
        return totalPower;
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
    public void invaderAttackPhase() {
        int j = 0;
        if(isIndaversPresent()) {
            if(isNativesPresent()) {
                for(int i = 0; i < invaderList.size(); i ++) {
                   int currentPower = invaderList.get(i).getAttackPower();
                   while(currentPower > 0 && j < nativeList.size()) {
                        int currentLifePoints = nativeList.get(j).getLifePoints();
                        if(currentLifePoints <= currentPower) {
                            currentPower -= currentLifePoints;
                            nativeList.remove(j);
                            j++;
                            } 
                        else { 
                            currentLifePoints -= currentPower;
                            }
                        }
                   }
                }
            if(getTotalInvaderPower() - getShieldPoints() > 2 && !protection) {
                this.blightLevel += 1;
                }

            }
        }

}
