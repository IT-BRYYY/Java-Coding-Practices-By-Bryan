package OOP;

abstract class HardwareComponent {
    private String componentName;
    private double temperature;

    public HardwareComponent(String componentName, double temperature) {
        this.componentName = componentName;
        this.temperature = temperature;
    }

    public String getComponentName() {
        return componentName;
    }

    public double getTemperature() {
        return temperature;
    }

    public abstract void runDiagnostics();
}

interface Monitorable {
    boolean isOverheating();
}

class ProcessorComponent extends HardwareComponent
        implements Monitorable {

    public ProcessorComponent(String componentName, double temperature) {
        super(componentName, temperature);
    }

    @Override
    public void runDiagnostics() {
        System.out.println("Running CPU diagnostics...");

        if (isOverheating()) {
            System.out.println("CPU Status: High temperature detected!");
        } else {
            System.out.println("CPU Status: Normal");
        }
    }

    @Override
    public boolean isOverheating() {
        return getTemperature() > 85;
    }
}

class GraphicsComponent extends HardwareComponent
        implements Monitorable {

    public GraphicsComponent(String componentName, double temperature) {
        super(componentName, temperature);
    }

    @Override
    public void runDiagnostics() {
        System.out.println("Running GPU diagnostics...");

        if (isOverheating()) {
            System.out.println("GPU Status: High temperature detected!");
        } else {
            System.out.println("GPU Status: Normal");
        }
    }

    @Override
    public boolean isOverheating() {
        return getTemperature() > 80;
    }
}

public class HardwareDiagnosticsDemo {
    public static void main(String[] args) {

        HardwareComponent[] components = {
                new ProcessorComponent("Intel Core i5", 78),
                new GraphicsComponent("NVIDIA GeForce", 88)
        };

        for (HardwareComponent component : components) {
            System.out.println("Component: "
                    + component.getComponentName());

            System.out.println("Temperature: "
                    + component.getTemperature() + "°C");

            component.runDiagnostics();

            Monitorable monitor = (Monitorable) component;

            System.out.println("Overheating: "
                    + monitor.isOverheating());

            System.out.println();
        }
    }
}