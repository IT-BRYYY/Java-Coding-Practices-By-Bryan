package OOP;

public class TestRectangle {
    public static void main(String[]args){
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1 width is " + rectangle1.getWidth() +
                "\nRectangle 1 height is " + rectangle1.getHeight() +
                "\nRectangle 1 area is " + rectangle1.getArea() +
                "\nRectangle 1 perimeter is " + rectangle1.getPerimeter());

        System.out.println("\nRectangle 2 width is " + rectangle2.getWidth() +
                "\nRectangle 1 height is " + rectangle2.getHeight() +
                "\nRectangle 1 area is " + rectangle2.getArea() +
                "\nRectangle 1 perimeter is " + rectangle2.getPerimeter());


    }
}
