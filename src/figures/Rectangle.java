package figures;

public class Rectangle implements Comparable<Rectangle> {
    private int width ;
    private int hight;

    public Rectangle(int width, int hight) {
        this.width = width;
        this.hight = hight;
    }

    public int getSquare(){
    return width*hight;
    }

    @Override
    public int compareTo(Rectangle r) {
        return this.getSquare() - r.getSquare();
    }

    @Override
    public String toString() {
        return "Square : " + getSquare();
    }
}

