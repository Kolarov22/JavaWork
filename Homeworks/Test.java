package Homeworks;
public class Test {
    public static void main(String[] args) {
        Song song1 = new Song("Song name", "Artist", 3, "Pop");
        Song song2 = new Song("Song name", "Artist", 3, "Pop");
        Song song3 = new Song("Song name", "Artist", 3, "Pop");
        Song song4 = new Song("Song name", "Artist", 3, "Pop");
        Song song5 = new Song("Song name", "Artist", 3, "Pop");
        Song song6 = new Song("Other song name", "Artist", 3, "Pop");
        Playlist Music = new Playlist();

        Music.addSong(song1);
        Music.addSong(song2);
        Music.addSong(song3);
        Music.addSong(song4);
        Music.addSong(song5);
        Music.addSong(song6);

        Music.printSongs();
        Music.removeByTitle("Song name");
        Music.printSongs();
        Music.removeByArtist("Artist");
        Music.printSongs();

        song1 = new Song("Damn", "Kendrick Lamar", 2.48, "Hip-Hop");
        song2 = new Song("Paradise city", "Guns n Roses", 3.24, "Rock");
        song3 = new Song("Day n Night", "Kid Cudi", 2.8, "Hip-Hop");
        song4 = new Song("Rap god", "Eminem", 2.65, "Rap");
        song5 = new Song("Ma duc sa tai un copac", "Mihai Margineanu", 4, "Traditional");
        song6 = new Song("Fur Elise", "Beethoven", 5, "Classic");

        Music.addSong(song1);
        Music.addSong(song2);
        Music.addSong(song3);
        Music.addSong(song4);
        Music.addSong(song5);
        Music.addSong(song6);

        Music.printSongs();
        Music.Shuffle();
        Music.printSongs();
    }
}
