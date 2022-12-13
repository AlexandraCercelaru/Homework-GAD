import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 2;
        Scanner scanner = new Scanner(System.in);
        Phone phone1 = new SamsungGalaxyS6(100, "red", "A", "12345ABC");
        Phone phone2 = new SamsungGalaxyWatch5(100, "blue", "B", "10549KGM");
        Phone phone3 = new HuaweiNova20SE(100, "purple", "C", "14311JNS");
        Phone phone4 = new HuaweiP50Pro(100, "black", "D", "14973AAG");

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone4);

        Contact contact1 = new Contact(1, "0765125562", "Alin", "Popescu");
        Contact contact2 = new Contact(2, "0764287313", "Maria", "Badea");

        phone1.addContact(contact1);
        phone1.addContact(contact2);

        phone1.listContacts();

        phone1.sendMessage(new Message(contact1.getNumberOfPhone(), "Acesta este mesajul 1"));
        phone1.seeMessage(contact1.getNumberOfPhone());

        phone1.makeCall(new Call(contact2.numberOfPhone));
        phone1.viewHistory();

        while (true) {
            System.out.println("Hello. The phone is SamsungGalaxyS6. What do you want to do? ");
            System.out.println("1 - create new contact ");
            System.out.println("2 - see existing contact");
            System.out.println("3 - send message");
            System.out.println("4 - see all messages for a specific contact");
            System.out.println("5 - make a call");
            System.out.println("6 - see all calls history");
            System.out.println("7 - close application");
            int cifra = scanner.nextInt();
            String currline = scanner.nextLine();
            if (cifra == 1) {
                i++;
                Contact cont = new Contact();
                cont.setIndex(i);
                System.out.println("Phone Number: ");
                currline = scanner.nextLine();
                cont.setNumberOfPhone(currline);
                System.out.println("First Name: ");
                currline = scanner.nextLine();
                cont.setFirstName(currline);
                System.out.println("Last Name: ");
                currline = scanner.nextLine();
                cont.setLastName(currline);
                phone1.addContact(cont);
            } else if (cifra == 2) {
                phone1.listContacts();
            } else if (cifra == 3) {
                Message message = new Message();
                System.out.println("Phone Number: ");
                currline = scanner.nextLine();
                message.setPhoneNumber(currline);
                System.out.println("Message: ");
                currline = scanner.nextLine();
                while (true) {
                    if (currline.length() > 500) {
                        System.out.println("Message too long! Try again");
                        currline = scanner.nextLine();
                    } else {
                        break;
                    }
                }
                message.setMessage(currline);
                phone1.sendMessage(message);
            } else if (cifra == 4) {
                System.out.println("Phone number: ");
                currline = scanner.nextLine();
                phone1.seeMessage(currline);
            } else if (cifra == 5) {
                Call c = new Call();
                System.out.println("Phone number: ");
                currline = scanner.nextLine();
                c.setPhoneNumber(currline);
                phone1.makeCall(c);
            } else if (cifra == 6) {
                phone1.viewHistory();
            } else {
                System.out.println("Have a good day");
                break;
            }
        }
    }
}