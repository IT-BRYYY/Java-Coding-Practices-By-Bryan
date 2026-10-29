package OOP;

import java.util.Arrays;

abstract class InternetConnection
        implements Comparable<InternetConnection> {

    private String provider;

    InternetConnection(String provider) {
        this.provider = provider;
    }

    public String getProvider() {
        return provider;
    }

    public abstract double getSpeed();

    @Override
    public int compareTo(InternetConnection other) {
        return Double.compare(
                other.getSpeed(),
                this.getSpeed()
        );
    }
}

class FiberConnection extends InternetConnection {
    private double speedMbps;

    FiberConnection(String provider, double speedMbps) {
        super(provider);
        this.speedMbps = speedMbps;
    }

    @Override
    public double getSpeed() {
        return speedMbps;
    }
}

public class InternetSpeedDemo {
    public static void main(String[] args) {
        InternetConnection[] connections = {
                new FiberConnection("Provider A", 100),
                new FiberConnection("Provider B", 300),
                new FiberConnection("Provider C", 200)
        };

        Arrays.sort(connections);

        System.out.println("Internet Speed Rankings:");

        for (int i = 0; i < connections.length; i++) {
            System.out.println(
                    (i + 1) + ". "
                            + connections[i].getProvider()
                            + " - "
                            + connections[i].getSpeed()
                            + " Mbps"
            );
        }
    }
}