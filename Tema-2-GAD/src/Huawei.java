import java.util.ArrayList;
import java.util.List;

abstract class Huawei implements Phone {
    private int batteryLife;
    protected String color;
    protected String material;
    List<Contact> contacts = new ArrayList<>();
    List<Message> messages = new ArrayList<>();
    List<Call> calls = new ArrayList<>();

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    @Override
    public String toString() {
        return "batteryLife=" + batteryLife + ", color='" + color + '\'' + ", material='" + material + '\'';
    }

    public Huawei(int batteryLife, String color, String material) {
        this.setBatteryLife(batteryLife);
        this.color = color;
        this.material = material;
    }

    public Huawei() {
        this.batteryLife = 0;
        this.color = null;
        this.material = null;
    }


    @Override
    public void listContacts() {
        if (contacts.size() == 0) System.out.println("List is empty. Add a contact first!");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i).toString());
        }
    }

    @Override
    public void seeMessage(String numberOfPhone) {
        int k = 0;
        for (int i = 0; i < messages.size(); i++) {
            if (messages.get(i).getPhoneNumber().equals(numberOfPhone)) {
                k++;
                System.out.println(messages.get(i).toString());
            }
        }
        if (k == 0) {
            System.out.println("List is empty. Send a message first!");
        }
    }

    @Override
    public void viewHistory() {
        if (calls.size() == 0) System.out.println("List is empty. Make a call first!");
        for (int i = 0; i < calls.size(); i++) {
            System.out.println(calls.get(i).toString());
        }
    }

    @Override
    public void makeCall(Call c) {
        int newBatteryLife = getBatteryLife() - 2;
        if (newBatteryLife == 0) {
            System.out.println("You can not make another call! Your battery life is 0");
        } else {
            setBatteryLife(newBatteryLife);
            System.out.println("You made a new call! The new battery life is: " + getBatteryLife());
        }
    }

    @Override
    public void sendMessage(Message M) {
        int newBatteryLife = getBatteryLife() - 1;
        if (newBatteryLife == 0) {
            System.out.println("You can not send another message! Your battery life is 0");
        } else {
            setBatteryLife(newBatteryLife);
            System.out.println("You sent a new message! The new battery life is: " + getBatteryLife());
        }
    }

    @Override
    public void addContact(Contact C) {
    }
}
