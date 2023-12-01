package multimedia;

import interfaces.Brightness;

public class ImageMedia extends MultimediaItem implements Brightness {

    int brightness;

    public ImageMedia(String title, int duration, int bright) {
        super(title, duration);
        this.brightness = bright;
    }

    @Override
    public void play() {
        show();

    }

    public void show() {
        String symbol = "*";
        for (int i = 0; i < getDuration(); i++) {
            System.out.println(getTitle() + " " + symbol.repeat(brightness));
        }
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


}
