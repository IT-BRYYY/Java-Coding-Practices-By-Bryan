package RealWorld_Projects.LibrarySystem;

public class EBook extends Book {
    private double fileSize;
    private String format;

    public EBook(String title, String author, int yearPublished, boolean isCheckedOut, double fileSize, String format){
        super(title,author,yearPublished,isCheckedOut);
        this.fileSize = fileSize;
        this.format = format;
    }
    public EBook(String title, String author, double fileSize){
        this(title,author,2020,false,fileSize,"PDF");
    }
    public EBook(String title){
        this(title,"Unknown",2020,false,2.5,"EPUB");
    }

    public double getFileSize(){
        return fileSize;
    }
    public String getFormat(){
        return format;
    }

    public void setFileSize(double fileSize){
        if(fileSize > 0){
            this.fileSize = fileSize;
        }else{
            System.out.println("File size must be greater than 0");
        }
    }

    public void setFormat(String format){
        if(format != null && !format.isEmpty()){
            this.format = format;
        }else{
            System.out.println("Format cannot be empty");
        }
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Format: " + format);

    }

}
