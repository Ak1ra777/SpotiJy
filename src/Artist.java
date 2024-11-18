public class Artist {
    private String firstName;
    private String lastName;
    private int birthYear;
    private Album[] albums;
    private Song[] singles;

    public Album[] getAlbums() {
        return albums;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Song[] getSingles() {
        return singles;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
