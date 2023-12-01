package multimedia;

import interfaces.Brightness;

public class ImageMedia extends MultimediaItem implements Brightness {

    int brightness;

    public ImageMedia(String title, int duration, int bright) {
        super(title, duration);
        this.brightness = bright;
    }

    //    nel caso venga erroneamente richiamato il metodo play() su una istanza di tipo ImageMedia viene stampato un errore.
    @Override
    public void play() {
        System.err.println("Errore, l'elemento multimediale è una immaggine, invoca il metodo show!");

    }

    //    il metodo show inizializza una stringa che simboleggia la lumionosità
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
