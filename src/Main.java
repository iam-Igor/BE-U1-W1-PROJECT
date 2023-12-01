import multimedia.AudioMedia;
import multimedia.ImageMedia;
import multimedia.MultimediaItem;
import multimedia.VideoMedia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        creo un array di tipo MultimediaItem di lunghezza 5
        MultimediaItem[] mediaItems = new MultimediaItem[5];
        Scanner userInput = new Scanner(System.in);

//        in questo blocco for ciclo tante volte quanto è la condizione per creare nuovi alementi, in questo caso 5 volte.
        for (int i = 0; i < 5; i++) {
            System.out.println("Che tipo di elemento vuoi creare? audio, video o immagine?");
            String chosenOption = userInput.nextLine();

//            in questo punto passo nel metodo il tipo di file scelto da creare e l'indice del loop in modo da
//            creare items progressivamente rispetto all'indice.
            createElement(chosenOption, mediaItems, i);
        }

//        in questa parte di codice viene chiesto quale elemento riprodurre, il metodo showItem accetterà
//        il numero scelto e come secondo parametro l'array di media appena popolato.

        System.out.println("Quale elemento vuoi riprodurre? Scegli un valore da 1 a 5, scegli 0 se vuoi uscire");
        int chosenMedia = Integer.parseInt(userInput.nextLine());
        showItem(chosenMedia, mediaItems);


    }


    //    in questo switch case si valuta che tipo di elemento creare in base all' input value arrivato
//    i case sono tutti simili nella loro mansione, si sceglie titolo, durata, ecc..
//    poi viene creata la nuova istanza in base al valore scelto prima e viene posizionato l'item nell'array in base al valore
//    dell'indice i passato come parametro dal loop for sopra.
    public static void createElement(String value, MultimediaItem[] mediaItems, int i) {
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
                mediaItems[i] = audio;
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
                mediaItems[i] = video;
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
                mediaItems[i] = imaage;
                break;
            }
            default:
                System.out.println("Errore nell'inserimento dei dati, riprova");
        }


    }

    public static void showItem(int item, MultimediaItem[] arrayItems) {

//        in questo metodo controllo prima quale sia l'elemento scelto dall'utente, dopodichè controllo se
//        l'elemento è una istanza della classe di tipo immagine, se è true lancio .show(),altrimenti lancio .play()


        if (item == 1) {
            if (arrayItems[0] instanceof ImageMedia) {
                ((ImageMedia) arrayItems[0]).show();
            } else {
                arrayItems[0].play();
            }
        } else if (item == 2) {
            if (arrayItems[1] instanceof ImageMedia) {
                ((ImageMedia) arrayItems[1]).show();
            } else {
                arrayItems[1].play();
            }
        } else if (item == 3) {
            if (arrayItems[2] instanceof ImageMedia) {
                ((ImageMedia) arrayItems[2]).show();
            } else {
                arrayItems[2].play();
            }
        } else if (item == 4) {
            if (arrayItems[3] instanceof ImageMedia) {
                ((ImageMedia) arrayItems[3]).show();
            } else {
                arrayItems[3].play();
            }
        } else if (item == 5) {
            if (arrayItems[4] instanceof ImageMedia) {
                ((ImageMedia) arrayItems[4]).show();
            } else {
                arrayItems[4].play();
            }
            //        nel caso la scelta sia zero si esce dal blocco.
        } else if (item == 0) {
            System.out.println("hai scelto di uscire dal player!");
        }
    }

}