public class HuaweiNova20SE extends Huawei {
    private String imei;

    @Override
    public String toString() {
        return "HuaweiNova20SE{" + super.toString() + ", imei='" + imei + '\'' + '}';
    }

    @Override
    public void listContacts() {
        super.listContacts();
    }

    @Override
    public void addContact(Contact C) {
        contacts.add(C);
    }

    public HuaweiNova20SE(int batteryLife, String color, String material, String imei) {
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

    public HuaweiNova20SE() {
        super();
        this.imei = null;
    }

}
