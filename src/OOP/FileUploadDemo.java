package OOP;

abstract class UploadFile {
    private String fileName;
    private double fileSize;

    public UploadFile(String fileName, double fileSize){
        this.fileName = fileName;
        this.fileSize = fileSize;

    }

    public String getFileName() {
        return fileName;
    }
    public double getFileSize() {
        return fileSize;
    }

    public abstract boolean validateFile();

    public void displayInfo(){
        System.out.println("Filename: " + fileName);
        System.out.println("Filesize: " + fileSize + " MB");
    }
}

interface Uploadable {
    void upload();
}

class ImageUpload extends UploadFile implements Uploadable {
    public ImageUpload(String fileName, double fileSize){
        super(fileName, fileSize);
    }

    @Override
    public boolean validateFile(){
        return getFileSize () > 0
                && getFileSize () <= 5
                && getFileName().toLowerCase().endsWith(".jpg");
    }

    @Override
    public void upload() {
        if(validateFile()){
            System.out.println("Image uploaded successfully.");
        }else {
            System.out.println("Invalid image file.");
        }
    }
}

class DocumentUpload extends UploadFile implements Uploadable {

    public DocumentUpload(String fileName, double fileSize){
        super(fileName, fileSize);
    }

    @Override
    public boolean validateFile() {
        return getFileSize() > 0
                && getFileSize () <= 10
                && getFileName().toLowerCase().endsWith(".pdf");
    }

    @Override
    public void upload() {
        if(validateFile()) {
            System.out.println("Document uploaded successfully");
        } else {
            System.out.println("Invalid document file");
        }
    }
}

public class FileUploadDemo {
    public static void main (String[]args) {

        UploadFile[] files = {
                new ImageUpload("profile.jpg", 3.5),
                new DocumentUpload("research.pdf", 12.0),
                new DocumentUpload("resume.pdf", 2.0)

        };

        for (UploadFile file : files) {
            file.displayInfo();

            System.out.println("Valid file " + file.validateFile());

            Uploadable uploadable = (Uploadable) file;
            uploadable.upload();

            System.out.println();
        }
    }
}