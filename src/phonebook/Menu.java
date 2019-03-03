package phonebook;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Database database;
    public Menu() {
        database = new Database(100);
        scanner = new Scanner(System.in);
    }


    public void start() {
        String answer;
        do{
            printMenu();
            System.out.print("Podaj swój wybór: ");
            answer = scanner.nextLine();

            switch (answer){
                case "1": {
                     Contact contact = getDataFromUserAndCreateContact();
                     database.addContact(contact);
                     break;
                }
                case "2": {
                     String surname = getSurnameFromUser();
                     if(database.removeContactBySurname(surname)){
                         System.out.println("Usunięto kontakt!");
                     }else{
                         System.out.println("Nie znaleziono kontaktu!");
                     }
                     break;
                }
                case "3": {
                    System.out.println("Wszystkie kontakty: ");
                    for (Contact contact : database.getContacts()) {
                        if(contact != null) {
                            System.out.println(contact);
                        }
                    }
                }


            }
        }while (!answer.equals("4"));
    }

    private String getSurnameFromUser() {
        System.out.println("Podaj nazwisko do usuniecia: ");
        return scanner.nextLine();
    }

    private Contact getDataFromUserAndCreateContact() {
        System.out.println("Podaj imie: ");
        String name = scanner.nextLine();

        System.out.println("Podaj nazwisko: ");
        String surname = scanner.nextLine();

        System.out.println("Podaj numer: ");
        String number = scanner.nextLine();

        return new Contact(name, surname, number);
    }

    private void printMenu() {
        System.out.println("1. Dodawanie kontaktu");
        System.out.println("2. Usuń kontakt po nazwisku");
        System.out.println("3. Wyświetl wszystkie kontakty");
        System.out.println("4. Aby wyjść");
    }
}
