public class HuaweiP50Pro extends Huawei {
    private String imei;

    @Override
    public String toString() {
        return "HuaweiP50Pro{" + super.toString() + ", imei='" + imei + '\'' + '}';
    }

    @Override
    public void listContacts() {
        super.listContacts();
    }

    @Override
    public void addContact(Contact C) {
        contacts.add(C);
    }

    public HuaweiP50Pro(int batteryLife, String color, String material, String imei) {
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

    public HuaweiP50Pro() {
        super();
        this.imei = null;
    }

}
