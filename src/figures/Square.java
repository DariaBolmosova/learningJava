package figures;

public class Square extends Rectangle
{

    public Square(int a, int b) {
        super(a, b);
    }

    @Override
    public int getSquare() {
        return (int)Math.pow(this.a,2);
    }

    @Override
    public String toString() {
        return "Square area : " + getSquare();
    }
}
