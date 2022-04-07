package lab;

public class Case {
    private String model = "X1432";
    private String manufacturer = "LG";
    private String powerSupply = "800W";
    private Dimensions dimensions = new Dimensions(50,100,70);

    public void pressPowerButton(){
        System.out.println("PowerButton Pressed");
    }
    public String toString(){
        return ("The case model is " + model + '\n' + "The case manufacturer is " + manufacturer + '\n'
                + "The case powersupply is " + powerSupply + '\n' + "The dimensions are :" + dimensions.toString() + '\n');
    }
}
