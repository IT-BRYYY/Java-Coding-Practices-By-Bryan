package OOP;

public class Student {
    String name;
    int age;
    double score;

    public Student(String n, int a, double s){
        name = n;
        age = a;
        score = s;
    }

    public void showStudent(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);

    }

    public void updateScore(double newScore){
        score = newScore;
    }

    public void checkResult(){
        if(score >= 75){
            System.out.println(name + " passed!");
        }else{
            System.out.println(name + " failed!");
        }

    }
}
