class Game{
    int mScore;
    Game(){
        mScore = 0;
    }
    Game(int startingScore){
        mScore = startingScore;
    }
}

class Contact{
    String name;
    String email;
    String phoneNumber;

    Contact(String n, String e, String pn){
        this.name = n;
        this.email = e;
        this.phoneNumber = pn;
    }
}

class ContactsManager{
    Contact [] myContacts;
    int myCount;


    ContactsManager(){
        this.myCount = 0;
        this.myContacts = new Contact[500];
    }

    void addContact(Contact contact){
        myContacts[myCount] = contact;
        myCount++;
    }
    Contact searchContact(String searchName){
        for(int i=0; i<myCount; i++){
            if(myContacts[i].name.equals(searchName)){
                return myContacts[i];
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String [] args){
        System.out.println("Hello World!");
        Game tetris = new Game(10);
        Game darts = new Game();

        ContactsManager myContactManager = new ContactsManager();

        Contact Jason = new Contact("jason", "testing", "416-123-1234");
        myContactManager.addContact(Jason);
        Contact result = myContactManager.searchContact("jason");
        System.out.println(result.phoneNumber);
    }
}

