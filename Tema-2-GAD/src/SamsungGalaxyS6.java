public class SamsungGalaxyS6 extends Samsung {
    private String imei;

    @Override
    public String toString() {
        return "SamsungGalaxyS6{" + super.toString() + ", imei='" + imei + '\'' + '}';
    }

    @Override
    public void listContacts() {
        super.listContacts();
    }

    @Override
    public void addContact(Contact C) {
        contacts.add(C);
    }

    public SamsungGalaxyS6(int batteryLife, String color, String material, String imei) {
        super(batteryLife, color, material);
        this.imei = imei;
    }

    @Override
    public void seeMessage(String numberOfPhone) {
        super.seeMessage(numberOfPhone);
    }

    @Override
    public void viewHistory() {
        super.viewHistory();
    }

    @Override
    public void sendMessage(Message M) {
        super.sendMessage(M);
        messages.add(M);
    }

    @Override
    public void makeCall(Call c) {
        super.makeCall(c);
        calls.add(c);
    }

    public SamsungGalaxyS6() {
        super();
        this.imei = null;
    }

}
