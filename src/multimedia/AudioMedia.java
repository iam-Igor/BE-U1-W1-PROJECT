package multimedia;

import interfaces.Volume;

public class AudioMedia extends MultimediaItem implements Volume {

    int volume;

    public AudioMedia(String title, int duration, int volume) {
        super(title, duration);
        this.volume = volume;
    }

    @Override
    public void play() {
        String symbol = "!";
        for (int i = 0; i < getDuration(); i++) {
            System.out.println(getTitle() + " " + (symbol.repeat(volume)));

        }
    }

    @Override
    public int volumeUp() {
        if (volume > 0) {
            volume++;
        }
        return volume;
    }

    @Override
    public int volumeDown() {
        return volume--;
    }
}
