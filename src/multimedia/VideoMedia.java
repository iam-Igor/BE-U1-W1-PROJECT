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
    public int brightnessUp() {

        if (brightness > 0) {
            brightness++;
        }
        return brightness;

    }

    @Override
    public int brightnessDown() {
        return brightness--;
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

    @Override
    public void play() {
//        inizializzo due stringhe che simboleggano volume e luminosità
        String symbol = "!";
        String symbol2 = "*";
        for (int i = 0; i < getDuration(); i++) {
            System.out.println(getTitle());
            
            // con il metodo repeat concateno la stringa "symbol" tante volte quanto è il suo parametro.

            System.out.println("Volume: " + symbol.repeat(volume));
            System.out.println("Brightness: " + symbol2.repeat(brightness));


        }

    }
}
