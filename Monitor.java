package lab;

public class Monitor {
    private Resolution resolution = new Resolution(1080,720);
    private String model = "3450 Ultra";
    private String manufacturer = "Dell";
    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," +y + " " + "in color " + color);
    }
    public String toString(){
        return("The monitor's resolution is: " + resolution.toString() + '\n' + "The monitor's manufacturer is " + manufacturer
                + '\n' + "The monitor's model is " + model + '\n');
    }
}
