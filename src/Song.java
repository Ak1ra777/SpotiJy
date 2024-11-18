import java.time.Duration;
import java.util.Objects;

public class Song {
    private String title;
    private int releaseYear;
    private int duration = 60;
    private int likes = 0;

    public Song(String title, int releaseYear, int duration, int likes){
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.likes = likes;
    }

    public Song(String title, int releaseYear, int duration){
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }

    public Song(String title, int releaseYear){
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public int getDuration() {
        return duration;
    }
    public int getLikes() {
        return likes;
    }

    public boolean changeDuration(int duration){
        if (duration < 0 || duration > 720 || duration == this.duration){
            return false;
        }else {
            this.duration = duration;
            return true;
        }
    }

    public void like(){
        likes++;
    }
    public void unlike(){
        if (likes>0)
            likes--;
    }

    public boolean isEqual(Song other){
        return this.title.equals(other.title) && this.releaseYear == other.releaseYear &&
                this.duration == other.duration;
    }

    @Override
    public String toString(){
        float minuteSec = 60;
        return "Title: " + title + ",Duration:" + (duration/minuteSec) + " minutes,Release year: "
                + releaseYear + ",Likes:" + likes;
    }
}
