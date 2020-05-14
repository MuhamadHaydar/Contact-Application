// Manage Contacts from this class.
public class ContactManager {

    // Array of Contacts to store contact.
    Contact [] myContact;
    // number of current contact;
    int currentContact;

    // Default Constructor.
    ContactManager(){
        // Current num of Contract.
        currentContact = 0;
        // Having 500 slots.
        myContact = new Contact[500];
    }

    // Add contact to myContact Array.
    public void addContact(Contact newContact){
        myContact[currentContact] = newContact;
        currentContact ++;
    }

    // Search by name of contact.
    public Contact searchContact(String nameContact){
        // Search over whole of contacts.
        for(int i = 0; i < currentContact; i++){
            if(myContact[i].name.equals(nameContact)){
                return myContact[i];
            }
        }
        return null;
    }
}
