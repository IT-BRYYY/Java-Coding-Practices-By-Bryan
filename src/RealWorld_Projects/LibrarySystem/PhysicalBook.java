package RealWorld_Projects.LibrarySystem;

public class PhysicalBook extends Book{
    private int pageCount;
    private String condition;

    public PhysicalBook(String title,String author,int yearPublished,boolean isCheckedOut,int pageCount,String condition){
        super(title,author,yearPublished,isCheckedOut);
        this.pageCount = pageCount;
        this.condition = condition;
    }
    public PhysicalBook(String title, String author, int pageCount){
        this(title, author,2020, false,pageCount,"GOOD");
    }
    public PhysicalBook(String title){
        this(title,"Unknown",2020,false,100,"NEW");
    }

    public int getPageCount(){
        return pageCount;
    }
    public String getCondition(){
        return condition;
    }

    public void setPageCount(int pageCount){
        if(pageCount > 0){
            this.pageCount = pageCount;
        }else {
            System.out.println("Page Count must be greater than 0");
        }
    }

    public void setCondition(String condition){
        if(condition != null && !condition.isEmpty()){
            this.condition = condition;
        }else{
            System.out.println("Condition cannot be empty");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Page Count " + pageCount);
        System.out.println("Condition " + condition);
    }
}
