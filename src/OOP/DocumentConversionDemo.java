package OOP;

abstract class DocumentFile {
    private String fileName;

    public DocumentFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public abstract void convert();
}

interface Compressible {
    void compress();
}

class WordDocument extends DocumentFile implements Compressible {

    public WordDocument(String fileName) {
        super(fileName);
    }

    @Override
    public void convert() {
        System.out.println("Converting " + getFileName() + " to PDF.");
    }

    @Override
    public void compress() {
        System.out.println("Compressing Word document.");
    }
}

class ImageDocument extends DocumentFile {

    public ImageDocument(String fileName) {
        super(fileName);
    }

    @Override
    public void convert() {
        System.out.println("Converting " + getFileName() + " to PNG.");
    }
}

public class DocumentConversionDemo {
    public static void main(String[] args) {
        DocumentFile[] documents = {
                new WordDocument("report.docx"),
                new ImageDocument("photo.jpg")
        };

        for (DocumentFile document : documents) {
            System.out.println("File: " + document.getFileName());
            document.convert();
            System.out.println();
        }

        Compressible compressible = (Compressible) documents[0];
        compressible.compress();
    }
}