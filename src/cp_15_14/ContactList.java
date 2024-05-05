package cp_15_14;

import java.util.Scanner;

public class ContactList {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String userName;
      String userNumber;
      ContactNode currNode;
      
      System.out.println("Person 1\nEnter name:");
      userName = scanner.nextLine();
      System.out.println("Enter phone number:");
      userNumber = scanner.nextLine();
      System.out.println("You entered: " + userName + ", " + userNumber + "\n");
      
      ContactNode person1 = new ContactNode(userName, userNumber);
      
      System.out.println("Person 2\nEnter name:");
      userName = scanner.nextLine();
      System.out.println("Enter phone number:");
      userNumber = scanner.nextLine();
      System.out.println("You entered: " + userName + ", " + userNumber + "\n");
      
      ContactNode person2 = new ContactNode(userName, userNumber);
      person1.insertAfter(person2);
      
      System.out.println("Person 3\nEnter name:");
      userName = scanner.nextLine();
      System.out.println("Enter phone number:");
      userNumber = scanner.nextLine();
      System.out.println("You entered: " + userName + ", " + userNumber + "\n");
      
      ContactNode person3 = new ContactNode(userName, userNumber);
      person2.insertAfter(person3);
      
      System.out.println("CONTACT LIST");
      currNode = person1;
      while (currNode != null) {
         System.out.println(currNode.toString() + "\n");
         currNode = currNode.getNext();
      }
      
      
   }
}
