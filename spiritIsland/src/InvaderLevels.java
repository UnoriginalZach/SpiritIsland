package src;

public enum InvaderLevels {
    EXPLORER(1),
    TOWN(2),
    CITY(3);

    private final int value;

    InvaderLevels(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
