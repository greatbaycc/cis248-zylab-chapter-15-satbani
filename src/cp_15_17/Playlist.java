package cp_15_17;

import java.util.Scanner;

public class Playlist {
    private final SongNode headNode;
    private SongNode lastNode;
    private SongNode currNode;

    public Playlist() {
        headNode = new SongNode();
        lastNode = headNode;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();

        String title;
        int length;
        String artist;

        // Read user input until -1  entered
        do {
            title = scanner.nextLine();
            if (!title.equals("-1")) {
                length = scanner.nextInt();
                scanner.nextLine();
                artist = scanner.nextLine();
                playlist.addNodeToList(new SongNode(title, length, artist));
            }
        } while (!title.equals("-1"));

        // Print linked list
        System.out.println("LIST OF SONGS");
        System.out.println("-------------");
        System.out.println(playlist);
    }

    private void addNodeToList(SongNode song) {
        currNode = song;
        lastNode.insertAfter(currNode);
        lastNode = currNode;
    }

    // TODO: Finish this method
    public String toString() {
      currNode = headNode;
      String output = "";
      currNode = currNode.getNext();
      while (currNode != null) {
         output += currNode.toString() + "\n";
         currNode = currNode.getNext();
      }
        return output;
    }
}
