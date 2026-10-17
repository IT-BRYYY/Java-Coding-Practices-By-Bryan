package OOP;

abstract class OfficeDevice {
    private String model;

    OfficeDevice(String model) {
        this.model = model;
    }

    public void showModel() {
        System.out.println("Model: " + model);
    }

    public abstract void powerOn();
}

interface PrintableDevice {
    void printDocument();
}

interface ScannableDevice {
    void scanDocument();
}

class MultifunctionPrinter extends OfficeDevice
        implements PrintableDevice, ScannableDevice {

    MultifunctionPrinter(String model) {
        super(model);
    }

    @Override
    public void powerOn() {
        System.out.println("Printer is powered on.");
    }

    @Override
    public void printDocument() {
        System.out.println("Printing document...");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning document...");
    }
}

public class PrinterDemo {
    public static void main(String[] args) {
        MultifunctionPrinter printer =
                new MultifunctionPrinter("Canon PIXMA");

        printer.showModel();
        printer.powerOn();

        PrintableDevice printable = printer;
        ScannableDevice scannable = printer;

        printable.printDocument();
        scannable.scanDocument();
    }
}