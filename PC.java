package lab;

public class PC {
    private Case case1;
    private MotherBoard motherBoard;
    private Monitor monitor;
    public PC (Case case1, MotherBoard motherboard, Monitor monitor){
        this.case1 = case1;
        this.motherBoard = motherboard;
        this.monitor = monitor;
    }
    private void drawLogo(){
        monitor.drawPixel(50,60,"blue");
    }
    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today" + '\n');
        System.out.println(case1.toString());
        System.out.println(motherBoard.toString());
        System.out.println(monitor.toString());
    }
    public void powerUp(){
        case1.pressPowerButton();
        drawLogo();
        motherBoard.loadProgram("Windows");
    }

}
