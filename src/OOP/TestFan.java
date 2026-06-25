package OOP;

public class TestFan {
    public static void main(String[]args){
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST,true,10,"Yellow");
        Fan fan3 = new Fan(Fan.MEDIUM,false,5,"Red");

        System.out.println("Default:");
        System.out.println(fan1);
        System.out.println("\nFan 2:");
        System.out.println(fan2);
        System.out.println("\nFan 3:");
        System.out.println(fan3);


    }
}
