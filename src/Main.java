import multimedia.AudioMedia;
import multimedia.ImageMedia;
import multimedia.MultimediaItem;
import multimedia.VideoMedia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MultimediaItem[] mediaItems = new MultimediaItem[5];
        Scanner userInput = new Scanner(System.in);

        System.out.println("Che tipo di elemento vuoi creare? audio, video o immagine?");
        String chosenOption = userInput.nextLine();
        createElement(chosenOption, mediaItems);


    }


    public static void createElement(String value, MultimediaItem[] mediaItems) {
        Scanner userInput = new Scanner(System.in);

        switch (value) {
            case "audio": {
                System.out.println("hai scelto audio, Inserisci il titolo");
                String title = userInput.nextLine();
                System.out.println("Inserisci la durata");
                int duration = Integer.parseInt(userInput.nextLine());
                System.out.println("Ora setta il volume");
                int volume = Integer.parseInt(userInput.nextLine());
                AudioMedia audio = new AudioMedia(title, duration, volume);
                mediaItems[0] = audio;
                break;
            }
            case "video": {
                System.out.println("Hai scelto video, Inserisci il titolo");
                String title = userInput.nextLine();
                System.out.println("Inserisci la durata");
                int duration = Integer.parseInt(userInput.nextLine());
                System.out.println("Ora setta il volume");
                int volume = Integer.parseInt(userInput.nextLine());
                System.out.println("Ora setta la luminosità");
                int brightness = Integer.parseInt(userInput.nextLine());
                VideoMedia video = new VideoMedia(title, duration, volume, brightness);
                mediaItems[0] = video;
                break;
            }
            case "immagine": {
                System.out.println("Hai scelto immagine, Inserisci il titolo");
                String title = userInput.nextLine();
                System.out.println("Inserisci la durata");
                int duration = Integer.parseInt(userInput.nextLine());
                System.out.println("Ora setta la luminosità");
                int brightness = Integer.parseInt(userInput.nextLine());
                ImageMedia imaage = new ImageMedia(title, duration, brightness);
                mediaItems[0] = imaage;
                break;
            }
            default:
                System.out.println("Errore nell'inserimento dei dati, riprova");
        }

    }
}