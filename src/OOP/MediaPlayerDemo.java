package OOP;

abstract class MediaFile {
    private String fileName;
    private int durationInSeconds;

    public MediaFile(String fileName, int durationInSeconds) {
        this.fileName = fileName;
        this.durationInSeconds = durationInSeconds;
    }

    public String getFileName() {
        return fileName;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public abstract void play();
}

interface Downloadable {
    void download();
}

class AudioFile extends MediaFile implements Downloadable {

    public AudioFile(String fileName, int durationInSeconds) {
        super(fileName, durationInSeconds);
    }

    @Override
    public void play() {
        System.out.println("Playing audio: " + getFileName());
    }

    @Override
    public void download() {
        System.out.println("Downloading audio file...");
    }
}

class VideoFile extends MediaFile {

    public VideoFile(String fileName, int durationInSeconds) {
        super(fileName, durationInSeconds);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + getFileName());
    }
}

public class MediaPlayerDemo {
    public static void main(String[] args) {
        MediaFile[] mediaFiles = {
                new AudioFile("favorite-song.mp3", 210),
                new VideoFile("tutorial.mp4", 600)
        };

        for (MediaFile file : mediaFiles) {
            file.play();

            System.out.println("Duration: "
                    + file.getDurationInSeconds() + " seconds");

            System.out.println();
        }

        Downloadable audio = (Downloadable) mediaFiles[0];
        audio.download();
    }
}