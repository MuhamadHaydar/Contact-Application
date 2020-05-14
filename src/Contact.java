
// Save information of each contact.
public class Contact {

    // Store contacts information.
    String name;
    String email;
    String phoneNumber;

    // Default constructor.
    Contact(){
        // Calls the second constructor.
        this(null,null,null);
    }

    // Parameterized constructor.
    Contact(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
