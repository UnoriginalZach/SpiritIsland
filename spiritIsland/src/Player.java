package src;

import java.util.ArrayList;

public class Player {
    private String name;
    private Spirits spirit;
    private int energy;
    private ArrayList discard = new ArrayList<>();
    private ArrayList elementsPlayed = new ArrayList<>();
    private ArrayList hand = new ArrayList<>();
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
}