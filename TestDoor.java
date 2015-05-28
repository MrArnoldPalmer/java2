public class TestDoor {
    public static void main(String args[]) {
        Door enter = new Door("Enter");
        Door exit =  new Door("Exit");
        Door treasure = new Door("Treasure");

        enter.unlock();
        enter.open();

        treasure.unlock();
        treasure.open();
        treasure.lock();

        enter.printString();
        exit.printString();
        treasure.printString();
    }
}