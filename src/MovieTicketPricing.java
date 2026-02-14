import java.util.Scanner;
public class MovieTicketPricing{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter day of week (1 to 7, 1 = Monday): ");
        int day = input.nextInt();

        System.out.print("Enter time (24-hour format, example 14 for 2pm): ");
        int time = input.nextInt();
        input.nextLine();


        System.out.print("Are you a student? (yes/no): ");
        String studentStatus = input.next();


        double price;
        String showType ;
        String category;

        if(day >= 1 && day <= 5 && time < 17){
            category = "Weekday Matinee";
        }else if (day >= 1 && day <= 5 && time >= 17){
            category = "Weekday Evening";
        }else if(day>= 6 && day <=7 && time < 17){
            category = "Weekend Matinee";
        }else if(day >=6 && day <= 7 && time >= 17){
            category = "Weekend Evening";
        }else{
            category = "Standard";
        }

        switch(category){
            case "Weekday Matinee":
                price = 8.50;
                showType = "WeekDay Matinee"; break;

            case "Weekday Evening":
                price = 12.50;
                showType = "WeekDay Evening"; break;

            case "Weekend Matinee":
                price = 10.50;
                showType = "Weekend Matinee"; break;

            case "Weekend Evening":
                price = 15.50;
                showType = "Weekend Evening"; break;

            default:
                price = 12.00;
                showType ="Standard"; break;
        }

        if(studentStatus.equalsIgnoreCase("yes")){
            price *= 0.90;
            showType += " and you have 10% Student Discount";
        }



        System.out.println("\nCategory: " + category);
        System.out.println("Show Type: " + showType);
        System.out.printf("Ticket Price: $%.2f%n", price);


        input.close();
    }
}