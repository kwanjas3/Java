class Game {
    int mScore;

    Game() {
        mScore = 0;
    }

    Game(int startingScore) {
        mScore = startingScore;
    }
}
// testing
class Contact {
    private String name;
    private String email;
    private String phoneNumber;

    Contact(String n, String e, String pn) {
        this.name = n;
        this.email = e;
        this.phoneNumber = pn;
    }
    public String rName(){
        return this.name;
    }
    public String rPhone(){
        return this.phoneNumber;
    }
}

class ContactsManager {
    private Contact[] myContacts;
    private int myCount;


    public ContactsManager() {
        this.myCount = 0;
        this.myContacts = new Contact[500];
    }

    public void addContact(Contact contact) {
        myContacts[myCount] = contact;
        myCount++;
    }

    public Contact searchContact(String searchName) {
        for (int i = 0; i < myCount; i++) {
            if (myContacts[i].rName().equals(searchName)) {
                return myContacts[i];
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Game tetris = new Game(10);
        Game darts = new Game();

        ContactsManager myContactManager = new ContactsManager();

        Contact Jason = new Contact("jason", "testing", "416-123-1234");
        myContactManager.addContact(Jason);
        Contact result = myContactManager.searchContact("jason");
        System.out.println(result.rPhone());
    }
}

