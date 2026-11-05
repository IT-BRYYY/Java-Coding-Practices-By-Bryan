package OOP;

abstract class MusicalInstrument {
    private String instrumentName;

    public MusicalInstrument(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public abstract void playSound();
}

interface Tunable {
    void tuneInstrument();
}

class Guitar extends MusicalInstrument implements Tunable {

    public Guitar(String instrumentName) {
        super(instrumentName);
    }

    @Override
    public void playSound() {
        System.out.println(getInstrumentName()
                + " produces a string sound.");
    }

    @Override
    public void tuneInstrument() {
        System.out.println(getInstrumentName()
                + " has been tuned.");
    }
}

class Drum extends MusicalInstrument {

    public Drum(String instrumentName) {
        super(instrumentName);
    }

    @Override
    public void playSound() {
        System.out.println(getInstrumentName()
                + " produces a percussion sound.");
    }
}

public class MusicInstrumentDemo {
    public static void main(String[] args) {

        MusicalInstrument[] instruments = {
                new Guitar("Acoustic Guitar"),
                new Drum("Drum Set")
        };

        for (MusicalInstrument instrument : instruments) {
            System.out.println("Instrument: "
                    + instrument.getInstrumentName());

            instrument.playSound();

            System.out.println();
        }

        Tunable guitar = (Tunable) instruments[0];
        guitar.tuneInstrument();
    }
}