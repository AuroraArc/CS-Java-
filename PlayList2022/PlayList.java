import java.util.ArrayList;

public class PlayList {

   private String title;
   private ArrayList<Song> songs;
   
   public PlayList(String title) {
      this.title = title;
      songs = new ArrayList<Song>();
   }
   
   public void addSong(Song song) {
      songs.add(song);
   }
   
   public void addSong(String title, String artist, String album, String duration) {
      addSong(new Song(title, artist, album, duration));
   }
   
   public void removeSong(String artist) {
      for (int i = songs.size() - 1; i >= 0; i--) {
         if (songs.get(i).getArtist().equals(artist)) {
            songs.remove(i);
         }
      }
      /*for (int i = 0; i < songs.size(); i++) {      
         if (artist.equals(songs.get(i).getArtist())) {
            songs.remove(i);
            i--;
         }   
      }*/
   }
   
   public String toString() {
      String s = title + "\n";
      for (Song song : songs) {
         s += song.toString() + "\n";
      }
      s += "\n";
      return s;
   }

}