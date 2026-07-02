package OOP;

public class PersonEmail {
    //Person email
    private String name;
    private int age;
    private String email;
    private java.util.Date createdDate;

    public PersonEmail(){
        this.name = "Unknown";
        this.age = 0;
        this.email = "noemail@example.com";
        this.createdDate = new java.util.Date();
    }
    public PersonEmail(String name, int age){
        this.name = name;
        this.age = age;
        this.email = "noemail@example.com";
        this.createdDate = new java.util.Date();
    }
    public PersonEmail(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
        this.createdDate = new java.util.Date();
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String email(){
        return email;
    }
    public java.util.Date getCreatedDate(){
        return createdDate;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age ){
        this.age = age;
    }
    public void setEmail(String email){
        if(email.contains("@") && email.contains(".")){
            this.email = email;
        }else{
            System.out.println("Invalid Email");
        }
    }
    public void displayInfo() {
        System.out.println("=== Person Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Created: " + createdDate);
        System.out.println("==========================");
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age +
                ", email='" + email + "', created=" + createdDate + "}";
    }
}
