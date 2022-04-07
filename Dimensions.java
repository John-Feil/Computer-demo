package lab;

public class Dimensions {
    private int width = 50;
    private int height = 100;
    private int depth = 75;

    public Dimensions(int width, int height, int depth){
        setWidth(width);
        setHeight(height);
        setDepth(depth);
    }

    public String toString(){
        return('\n' + "The dimensions width is " + getWidth() + '\n' + "The dimensions height is " + getHeight() + '\n'
                + "The dimensions depth is " + getDepth() + '\n');
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

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
