package src;

import java.util.ArrayList;

public class Card {
    private int cost;
    private String name;
    private String description;
    private int range;
    private ArrayList<String> elements = new ArrayList<String>(8);
    private String speed;
    public Card (int cost, String name, String description, int range,String speed, String element) {
        this.cost = cost;
        this.name = name;
        this.description = description;
        this.range = range;
        this.speed = speed;
        this.elements.add(element.toLowerCase());
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getRange() {
        return this.range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setElements(ArrayList<String> elements) {
        this.elements = elements;
    }
    public ArrayList<String> getElements() {
        return elements;
    }

    public String getSpeed() {
        return this.speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
    
}
