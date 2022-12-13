public class Call {
    String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Call{" + "phoneNumber='" + phoneNumber + '\'' + '}';
    }

    public Call(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Call() {
        this.phoneNumber = null;
    }
}
