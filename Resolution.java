package lab;

public class Resolution {
    private int width = 1080;
    private int height = 780;

    public Resolution(int width1, int height1){
        setWidth(width1);
        setHeight(height1);
    }

    public String toString(){
        return ('\n' + "The resolution's width is " + getWidth() + '\n' + "The resolutions height is " + getHeight() + '\n');
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
