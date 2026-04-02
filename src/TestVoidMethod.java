public class TestVoidMethod {
    public static void main (String[]args){
        System.out.print("The grade is ");
        printGrade(88.6);

        System.out.print("The grade is ");
        printGrade(110.6);

    }

    public static void printGrade(double score){
        if(score < 0 || score > 100){
            System.out.println("Invalid Score.");
            return;
        }

        if(score >= 90){
            System.out.println('A');
        }else if(score >= 80){
            System.out.println('B');
        }else if(score >= 70){
            System.out.println('C');
        }else if(score >= 60){
            System.out.println('D');
        }else {
            System.out.println('E');
        }

    }
}
