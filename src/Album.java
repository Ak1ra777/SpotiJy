import java.util.Random;

public class Album {
    private String title;
    private int releaseYear;
    Song[] songs;

    public Album(String title, int releaseYear){
        this.title = title;
        this.releaseYear = releaseYear;
        this.songs = new Song[15];
    }

    public String getTitle(){
        return title;
    }
    public int getReleaseYear(){
        return releaseYear;
    }
    public Song[] getSongs(){
        return songs;
    }

    public int addSongs(Song[] songs){
        int count = 0;
        for (Song song : songs){
            boolean isDuplicate = false;
            for (Song existingSong : this.songs){
                if (existingSong == null){
                    break;
                }
                else if (existingSong.isEqual(song)){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                for (int i = 0; i<this.songs.length; i++){
                    if(this.songs[i]==null){
                        this.songs[i] = song;
                        count++;
                        break;
                    }
                }            }
        }
        return count;
    }

    public Song[] sortByPopularity(boolean isAscending){
        int n = songs.length;

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (songs[j] == null || songs[j+1] == null)
                    continue;

                boolean comparison = songs[j].getLikes() > songs[j+1].getLikes();

                if (isAscending && comparison || (!isAscending) && (!comparison)){
                    Song temp = songs[j];
                    songs[j] = songs[j+1];
                    songs[j+1] = temp;
                }
            }
        }

        return songs;
    }

    public Song[] sortByReleaseYear(boolean isAscending){
        int n = songs.length;

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (songs[j] == null || songs[j+1] == null){
                    continue;
                }

                boolean comparison = songs[j].getReleaseYear() > songs[j+1].getReleaseYear();

                if (isAscending && comparison || (!isAscending) && (!comparison)){
                    Song temp = songs[j];
                    songs[j] = songs[j+1];
                    songs[j+1] = temp;
                }
            }
        }
        return songs;
    }

    public Song[] sortByDuration(boolean isAscending){
        int n = songs.length;

        for (int i = 0; i< n-1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (songs[j] == null || songs[j+1] == null)
                    continue;

                boolean comparison = songs[j].getDuration() > songs[j+1].getDuration();

                if (isAscending && comparison || (!isAscending) && (!comparison)){
                    Song temp = songs[j];
                    songs[j] = songs[j+1];
                    songs[j+1] = temp;
                }
            }
        }
        return songs;
    }

    static Song[] reverse(Song[] songs){
        for (int i = 0; i < songs.length/2; i++){
            Song temp = songs[i];
            songs[i] = songs[songs.length - 1 - i];
            songs[songs.length - 1 - i] = temp;
        }
        return songs;
    }

    public Song[] sortByTitle(boolean isAscending){
        int n = songs.length;

        for (int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if (songs[j] == null || songs[j+1] == null)
                    continue;

                int comparison = songs[i].getTitle().compareTo(songs[j+1].getTitle());

                if (isAscending && comparison>0 || (!isAscending) && comparison < 0){
                    Song temp = songs[j];
                    songs[j] = songs[j+1];
                    songs[j+1] = temp;
                }
            }
        }
        return songs;
    }

    public Song[] shuffle(){
        Random random = new Random();
        int notNullCount = 0;
        for (Song song : songs){
            if (song != null)
                notNullCount++;
        }
        for (int i = 0; i<notNullCount; i++){
            int randomIndex = random.nextInt(notNullCount);
            Song temp = songs[randomIndex];
            songs[randomIndex] = songs[i];
            songs[i] = temp;
        }
        return songs;
    }

}
