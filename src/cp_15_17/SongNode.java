public class SongNode {
    private final String songTitle;
    private final int songLength;
    private final String songArtist;
    private SongNode nextNode; // Reference to the next node

    // No-argument constructor
    public SongNode() {
        this("", 0, "");
    }

    // Parameterized constructor (next node is unknown)
    public SongNode(String title, int length, String artist) {
        songTitle = title;
        songLength = length;
        songArtist = artist;
        nextNode = null;
    }

    // TODO: Complete this method to insert a new node after
    // the node passed as an argument
   public void insertAfter(SongNode node) {
      SongNode tmpNext;
      tmpNext = this.nextNode;
      this.nextNode = node;
      node.nextNode = tmpNext;
   }

    // Get location pointed by nextNode
    public SongNode getNext() {
        return nextNode;
    }

    // TODO: Complete this method to represent a single song
    // as a String
    public String toString() {
        return "Title: " + songTitle + "\nLength: " + songLength + "\nArtist: " + songArtist + "\n";
    }
}
