package OOP;

abstract class AudioContent {
    protected String title;

    AudioContent(String title) {
        this.title = title;
    }

    public abstract void play();
}

interface VolumeControllable {
    void setVolume(int volume);
}

class PodcastEpisode extends AudioContent
        implements VolumeControllable {

    private int volume;

    PodcastEpisode(String title) {
        super(title);
        this.volume = 50;
    }

    @Override
    public void play() {
        System.out.println("Playing: " + title);
        System.out.println("Volume: " + volume);
    }

    @Override
    public void setVolume(int volume) {
        if (volume < 0 || volume > 100) {
            System.out.println(
                    "Volume must be between 0 and 100."
            );
            return;
        }

        this.volume = volume;
        System.out.println("Volume updated.");
    }
}

public class MusicPlayerDemo {
    public static void main(String[] args) {
        PodcastEpisode episode =
                new PodcastEpisode("Java for Beginners");

        episode.play();

        episode.setVolume(80);
        episode.play();
    }
}