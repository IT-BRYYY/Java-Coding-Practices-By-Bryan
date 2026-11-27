package OOP;

abstract class DataExporter {
    private String fileName;
    private String[] records;

    public DataExporter(String fileName, String[] records) {
        this.fileName = fileName;
        this.records = records;
    }

    public String getFileName(){
        return fileName;
    }

    public String[] getRecords(){
        return records.clone();
    }

    public abstract String exportData();

    public void displayInfo(){
        System.out.println("File Name: " + fileName);
        System.out.println("Total Records: " + records.length);
    }
}

interface ExportValidatable{
    boolean validateData();
}

class CsvDataExporter extends DataExporter implements ExportValidatable {

    public CsvDataExporter(String fileName, String[] records) {
        super(fileName, records);
    }

    @Override
    public boolean validateData() {
        return getRecords().length > 0
                && getFileName().endsWith(".csv");
    }

    @Override
    public String exportData() {
        if(!validateData()) {
            return "Invalid CSV export.";
        }

        String result = "Name\n";

        for(String record : getRecords()) {
            result += "\"" + record.replace("\"", "\"\"") + "\"n";
        }

        return result;
    }
}

class JsonDataExporter extends DataExporter implements ExportValidatable {

    public JsonDataExporter(String fileName, String[] records) {
        super(fileName, records);
    }

    @Override
    public boolean validateData() {
        return getRecords().length > 0
                && getFileName().endsWith(".json");
    }

    @Override
    public String exportData() {
        if(!validateData()) {
            return "Invalid HSON export.";
        }

        String [] records = getRecords();
        String result = "[\n";

        for(int i = 0; i < records.length; i++){
            result += "  \"" + records[i] + "\"";

            if(i < records.length - 1) {
                result += ",";
            }

            result += "\n";
        }
        return result + "]";
    }
}

public class DataExportDemo{
    public static void main (String []args) {

        String[] names = {"John", "Michael", "David"};

        DataExporter[] exporters = {
                new CsvDataExporter("users.csv",names),
                new JsonDataExporter("users.json", names),
                new CsvDataExporter("users.txt", names)
        };

        for(DataExporter exporter : exporters){

            exporter.displayInfo();

            if(exporter instanceof ExportValidatable){
                ExportValidatable validator = (ExportValidatable) exporter;

                System.out.println("Valid: " + validator.validateData());
            }

            System.out.println("Export Result: ");
            System.out.println(exporter.exportData());

            System.out.println();
        }
    }
}