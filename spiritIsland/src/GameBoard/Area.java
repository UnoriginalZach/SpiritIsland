package src.GameBoard;
import java.util.*;

import src.Dahan;
import src.Invaders.Explorer;
import src.Invaders.Invader;
public class Area {
    private ArrayList<Invader> invaderList = new ArrayList<Invader>();
    private ArrayList<Dahan> dahanList = new ArrayList<Dahan>();
    private String type;
    private int number;
    private int presence;
    private boolean holySite;
    private int blightLevel = 0;
    private boolean protection;
    private int shieldPoints;
   
    public Area(String type, int number, int presence) {
        this.type = type;
        this.number = number;
        this.presence = presence;
    }
    public Area(String type, int number, int presence, int numOfInvaders, int numOfdahans) {
        this.type = type;
        this.number = number;
        this.presence = presence;
        for(int i = 0; i < numOfInvaders; i++) {
            Explorer explorer = new  Explorer();
            invaderList.add(explorer);
        }
        for( int i = 0; i < numOfdahans; i++) {
            Dahan dahan = new Dahan();
            dahanList.add(dahan);
        }
    }



    public boolean isdahansPresent() {
        if(dahanList.size() > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isInvadersPresent() {
        if(invaderList.size() > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public ArrayList<Dahan> getdahanList() {
        return this.dahanList;
    }

    public void setdahanList(ArrayList<Dahan> dahanList) {
        this.dahanList = dahanList;
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

    public Invader getInvader(int i) {
        return invaderList.get(i);
    }

    public int getTotalInvaders() {
        return invaderList.size();
    }
    public int getTotalDahan() {
        return dahanList.size();
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

    public int getTotalDahanPower() {
        int totalPower = dahanList.size() * 2;
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
        if(isInvadersPresent()) {
            if(isdahansPresent()) {
                for(int i = 0; i < invaderList.size(); i ++) {
                   int currentPower = invaderList.get(i).getAttackPower();
                   while(currentPower > 0 && j < dahanList.size()) {
                        int currentLifePoints = dahanList.get(j).getLifePoints();
                        if(currentLifePoints <= currentPower) {
                            currentPower -= currentLifePoints;
                            dahanList.remove(j);
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
        public void playerAttackPhase(int invaderTarget, int spiritPower) {
                int totalPower = spiritPower;
                if(invaderList.get(invaderTarget).getLifePoints() < totalPower) {
                    invaderList.remove(invaderTarget);
                } else {
                    invaderList.get(invaderTarget).damageTaken(totalPower);
                }
            
        
    }
    public void dahanAttackPhase() {
        int j = 0;
        if(isdahansPresent()) {
            if(isInvadersPresent()) {
                for(int i = 0; i < dahanList.size(); i ++) {
                   int currentPower = dahanList.get(i).getAttackPower();
                   while(currentPower > 0 && j < invaderList.size()) {
                        int currentLifePoints = invaderList.get(j).getLifePoints();
                        if(currentLifePoints <= currentPower) {
                            currentPower -= currentLifePoints;
                            invaderList.remove(j);
                            j++;
                            } 
                        else { 
                            currentLifePoints -= currentPower;
                            }
                        }
                   }
                }
            }
    }
}

