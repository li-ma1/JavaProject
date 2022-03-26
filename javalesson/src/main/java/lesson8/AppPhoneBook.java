package lesson8;

public class AppPhoneBook {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();

        phonebook.add(345678, "Linda");
        phonebook.add(234347, "Linda");
        phonebook.add(986654, "Tom");
        phonebook.add(234567, "Ann");
        phonebook.add(678532, "Ann");
        phonebook.add(123455, "Ann");

        phonebook.get("Ann");
        phonebook.get("Linda");
        phonebook.get("Bob");
    }
}
