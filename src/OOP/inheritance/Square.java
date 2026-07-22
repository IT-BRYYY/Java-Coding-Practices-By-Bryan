package OOP.inheritance;

public class Square extends Rectangle {
    public Square() {
        super(1, 1);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public String toString() {
        return "A Square with side " + getSide() +
                "\n" + super.toString();
    }
}