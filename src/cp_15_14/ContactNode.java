package cp_15_14;

public class ContactNode {
   private String contactName;
   private String contactPhoneNumber;
   private ContactNode nextNodePt;
   
   public ContactNode(String inputName, String inputNumber) {
      contactName = inputName;
      contactPhoneNumber = inputNumber;
   }
   
   public String getName() {
      return contactName;
   }
   public String getPhoneNumber() {
      return contactPhoneNumber;
   }
   public void insertAfter(ContactNode nodeLoc) {
      ContactNode tmpNext;

      tmpNext = this.nextNodePt;
      this.nextNodePt = nodeLoc;
      nodeLoc.nextNodePt = tmpNext;
   }
   public ContactNode getNext() {
      return nextNodePt;
   }
   public String toString() {
      return "Name: " + contactName + "\nPhone number: " + contactPhoneNumber;
   }
}
