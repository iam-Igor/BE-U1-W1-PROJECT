package multimedia;

public abstract class MultimediaItem {

    private String title;
    private int duration;


    public MultimediaItem(String title, int duration) {
        this.title = title;
        this.duration = duration;

    }


    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }


    public abstract void play();


}
