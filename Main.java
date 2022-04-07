package lab;

public class Main {
    public static void main(String[] args) {
        Case newCase = new Case();
        MotherBoard newMotherBoard = new MotherBoard();
        Monitor newMonitor = new Monitor();
        PC pc = new PC(newCase,newMotherBoard,newMonitor);
        pc.description();
        pc.powerUp();
    }
}
