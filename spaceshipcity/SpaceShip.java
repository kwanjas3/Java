public interface SpaceShip {
    boolean launch();
    boolean land();
    boolean canCarry(Item x);
    void carry(Item x);
}

