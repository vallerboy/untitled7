package phonebook;

public class Database {
    private Contact[] contacts;

    public Database(int size){
        contacts = new Contact[size];
    }

    public void addContact(Contact contact){
        if(!isNumberAndSurnameFree(contact)){ //jeśli numer lub nazwisko jest zajete - przerwij dodawanie kontaktu
            return;
        }

        for (int i = 0; i < contacts.length; i++) {
            if(contacts[i] == null) {
                contacts[i] = contact;
                break;
            }
        }
    }

    private boolean isNumberAndSurnameFree(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if(contacts[i] != null && (contacts[i].getNumber().equals(contact.getNumber()) ||
                                      contacts[i].getSurname().equals(contact.getSurname()))) {
                return false;
            }
        }

        return true;
    }

    //return true if function removed something, false otherwise;
    public boolean removeContactBySurname(String surname){
        for (int i = 0; i < contacts.length; i++) {
            if(contacts[i] != null && contacts[i].getSurname().equals(surname)){
                contacts[i] = null;
                return true;
            }
        }

        return false;
    }

    public Contact[] getContacts() {
        return contacts;
    }
}
