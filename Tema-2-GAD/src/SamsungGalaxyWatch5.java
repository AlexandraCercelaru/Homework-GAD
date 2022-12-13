public class SamsungGalaxyWatch5 extends Samsung {
    private String imei;

    @Override
    public String toString() {
        return "SamsungGalaxyWatch5{" + super.toString() + ", imei='" + imei + '\'' + '}';
    }

    @Override
    public void listContacts() {
        super.listContacts();
    }

    @Override
    public void addContact(Contact C) {
        contacts.add(C);
    }

    public SamsungGalaxyWatch5(int batteryLife, String color, String material, String imei) {
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

    public SamsungGalaxyWatch5() {
        super();
        this.imei = null;
    }

}
