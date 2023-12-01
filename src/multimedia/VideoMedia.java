package multimedia;

import interfaces.Brightness;
import interfaces.Volume;

public class VideoMedia extends MultimediaItem implements Brightness, Volume {


    int volume;
    int brightness;


    public VideoMedia(String title, int duration, int volume, int brightness) {
        super(title, duration);
        this.volume = volume;
        this.brightness = brightness;
    }

    @Override
    public void brightnessUp() {

        if (brightness > 0) {
            System.out.println(brightness++);
        }

    }

    @Override
    public void brightnessDown() {
        System.out.println(brightness--);

    }

    @Override
    public void volumeUp() {
        if (volume > 0) {
            System.out.println(volume++);
        }
    }

    @Override
    public void volumeDown() {
        System.out.println(volume--);
    }

    @Override
    public void play() {
        for (int i = 0; i < getDuration(); i++) {
            System.out.println(getTitle());
        }

    }
}
