package src;

import java.util.ArrayList;

public class Player {
    private String name;
    private Spirits spirit;
    private int energy;
    private ArrayList<Card> discard = new ArrayList<Card>();
    private ArrayList<Card> elementsPlayed = new ArrayList<Card>();
    private ArrayList<Card> hand = new ArrayList<Card>();
    private ArrayList<Card> cardsPlayed = new ArrayList<Card>();

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Spirits getSpirit() {
        return this.spirit;
    }

    public void setSpirit(Spirits spirit) {
        this.spirit = spirit;
    }
    public void getHand() {
        for(int i = 0; i < hand.size() -1; i ++) {
            System.out.println(hand.get(i));
        }
    }
    public void getDiscard() {
        for(int i = 0; i < discard.size() -1; i ++) {
            System.out.println(discard.get(i));
        }
    }
    public void getElements() {
        for(int i = 0; i < elementsPlayed.size() -1; i ++) {
            System.out.println(elementsPlayed.get(i));
        }
    }
    public void addCardToHand(Card card) {
        hand.add(card);
    }
    public void DiscardCard (Card card) {
        discard.add(card);
    }
    public void getTotalElementsPlayed(ArrayList<Card> cardsPlayed) {
        int totalWater = 0;
        int totalFire = 0;
        int totalEarth = 0;
        int totalAir = 0;
        int totalPlant = 0;
        int totalAnimal = 0;
        int totalMoon = 0;
        int totalSun = 0;
        for(int i = 0; i < cardsPlayed.size() - 1; i ++) {
            for(int j = 0; j <cardsPlayed.get(i).getElements().size() -1; i ++) {
                switch(cardsPlayed.get(i).getElements().get(j)) {
                    case "water":
                        totalWater++;
                        break;
                    case "fire":
                        totalFire++;
                        break;
                    case "earth":
                        totalEarth++;
                        break;
                    case "air":
                        totalAir++;
                        break;
                    case "plant":
                        totalPlant++;
                        break;
                    case "animal":
                        totalAnimal++;
                        break;
                    case "moon":
                        totalMoon++;
                        break;
                    case "sun":
                        totalSun++;
                        break;
                }
            }
        }
        System.out.println("total water obtained this round is: "+totalWater);
        System.out.println("total fire obtained this round is: "+totalFire);
        System.out.println("total earth obtained this round is: "+totalEarth);
        System.out.println("total air obtained this round is: "+totalAir);
        System.out.println("total plant obtained this round is: "+totalPlant);
        System.out.println("total animal obtained this round is: "+totalAnimal);
        System.out.println("total sun obtained this round is: "+totalSun);
        System.out.println("total moon obtained this round is: "+totalMoon);
    }
}