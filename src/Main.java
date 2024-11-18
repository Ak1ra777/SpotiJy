import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create sample Song objects
        Song song1 = new Song("Imagine", 1971, 183, 5000);
        Song song2 = new Song("Bohemian Rhapsody", 1975, 354, 12000);
        Song song3 = new Song("Hey Jude", 1968, 431, 9000);
        Song song4 = new Song("Yesterday", 1965, 125, 8000);
        Song song5 = new Song("Smells Like Teen Spirit", 1991, 301, 15000);

        // Create an Album and add songs to it
        Album album = new Album("Greatest Hits", 2024);
        album.songs = new Song[5]; // Initialize album with capacity for 5 songs
        album.addSongs(new Song[] { song1, song2, song3, song4, song5 });

        // Display original song list
        System.out.println("Original songs:");
        for (Song song : album.getSongs()) {
            if (song != null) {
                System.out.println(song);
            }
        }

        // Test sorting in ascending order
        System.out.println("\nSongs sorted by title in ascending order:");
        Song[] sortedSongsAsc = album.sortByTitle(true);
        for (Song song : sortedSongsAsc) {
            if (song != null) {
                System.out.println(song);
            }
        }

        // Test sorting in descending order
        System.out.println("\nSongs sorted by popularity in descending order:");
        Song[] sortedSongsDesc = album.sortByPopularity(true);
        for (Song song : sortedSongsDesc) {
            if (song != null) {
                System.out.println(song);
            }
        }

        // Test shuffling songs
        System.out.println("\nShuffled songs:");
        Song[] shuffledSongs = album.shuffle();
        for (Song song : shuffledSongs) {
            if (song != null) {
                System.out.println(song);
            }
        }
    }
}
