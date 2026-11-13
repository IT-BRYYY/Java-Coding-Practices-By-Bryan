package OOP;

abstract class AgriculturalCrop {
    private String cropName;
    private int daysPlanted;

    public AgriculturalCrop(String cropName, int daysPlanted) {
        this.cropName = cropName;
        this.daysPlanted = daysPlanted;
    }

    public String getCropName() {
        return cropName;
    }

    public int getDaysPlanted() {
        return daysPlanted;
    }

    public abstract void checkGrowthStatus();
}

interface Harvestable {
    boolean isReadyForHarvest();
}

class RiceCrop extends AgriculturalCrop implements Harvestable {

    public RiceCrop(String cropName, int daysPlanted) {
        super(cropName, daysPlanted);
    }

    @Override
    public void checkGrowthStatus() {
        System.out.println("Checking rice growth...");

        if (getDaysPlanted() >= 100) {
            System.out.println("Growth Status: Mature");
        } else {
            System.out.println("Growth Status: Still growing");
        }
    }

    @Override
    public boolean isReadyForHarvest() {
        return getDaysPlanted() >= 100;
    }
}

class CornCrop extends AgriculturalCrop implements Harvestable {

    public CornCrop(String cropName, int daysPlanted) {
        super(cropName, daysPlanted);
    }

    @Override
    public void checkGrowthStatus() {
        System.out.println("Checking corn growth...");

        if (getDaysPlanted() >= 90) {
            System.out.println("Growth Status: Mature");
        } else {
            System.out.println("Growth Status: Still growing");
        }
    }

    @Override
    public boolean isReadyForHarvest() {
        return getDaysPlanted() >= 90;
    }
}

public class CropMonitoringDemo {
    public static void main(String[] args) {

        AgriculturalCrop[] crops = {
                new RiceCrop("Rice", 110),
                new CornCrop("Corn", 75)
        };

        for (AgriculturalCrop crop : crops) {
            System.out.println("Crop: " + crop.getCropName());
            System.out.println("Days Planted: " + crop.getDaysPlanted());

            crop.checkGrowthStatus();

            Harvestable harvest = (Harvestable) crop;

            System.out.println("Ready for Harvest: "
                    + harvest.isReadyForHarvest());

            System.out.println();
        }
    }
}