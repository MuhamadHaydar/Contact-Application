
// Main Class
public class Main {

    // Main method
    public static void main (String [] args){

        // Create an object of ContactManager.
        ContactManager contactManager = new ContactManager();

        // Create first contact to add to contact manager.
        Contact firstContact = new Contact("Muhamad","muhamadhaydarjawad@gmail.com","7434343434");
        contactManager.addContact(firstContact);
        // Create first contact to add to contact manager.
        Contact secondContact = new Contact("ali","ali121@gmail.com","4323243324342");
        contactManager.addContact(secondContact);

        // Search within contacts by name.
        Contact searchedContact = contactManager.searchContact("ali");
        // Print whole of searched information.
        System.out.println(searchedContact.name);
        System.out.println(searchedContact.email);
        System.out.println(searchedContact.phoneNumber);
    }
}
