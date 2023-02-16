public class PlayListTester {

   public static void main(String[] args) {
   
      PlayList pl = new PlayList("My awesome playlist");
      pl.addSong("Run Like Hell", "Pink Floyd", "The Wall", "3:30");
      pl.addSong("Donda Chant", "Ye", "Donda", "4:30");
      pl.addSong("People in Paris", "Ye", "", "3:30");
      pl.addSong("Who Let the Frogs Out?", "Crazy Frog", "Crazy Frog's Crazy Hits", "10:00");
      pl.addSong("An American in Paris", "George Gershwin", "An American in Paris", "18:00");
      
      System.out.println(pl.toString());
      pl.removeSong("Ye");
      System.out.println(pl.toString());
   
   }

}