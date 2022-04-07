package lab;

public class MotherBoard {
    private String model = "Z382";
    private String manufacturer = "Asus";
    private int ramSlots = 4;
    private int cardSlots = 2;
    private String bios = "Windows";
    public void loadProgram(String programName){
        System.out.println(programName + " is now running");
    }
    public String toString(){
        return("The motherboard's model is " + model + '\n' + "The motherboard's manufacturer is " + manufacturer
                + '\n' + "The motherboard's ramslots holds " + ramSlots + '\n' + "The motherboard's cardslots holds "
                 + cardSlots + '\n' + "The motherboard's bios is " + bios + '\n');
    }
}
