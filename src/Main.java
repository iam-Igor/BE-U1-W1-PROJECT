import multimedia.AudioMedia;
import multimedia.ImageMedia;
import multimedia.VideoMedia;

public class Main {
    public static void main(String[] args) {


        AudioMedia song1 = new AudioMedia("titolo", 2, 2);
        song1.volumeDown();
        song1.volumeUp();
        song1.play();


        VideoMedia video1 = new VideoMedia("video", 2, 2, 3);
        video1.volumeDown();
        video1.brightnessDown();
        video1.play();


        ImageMedia image1 = new ImageMedia("image", 5, 2);
        image1.brightnessDown();
        image1.show();

    }
}