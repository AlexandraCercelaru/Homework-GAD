public class Message {
    String phoneNumber;
    String message;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Message{" + "phoneNumber='" + phoneNumber + '\'' + ", message='" + message + '\'' + '}';
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message(String phoneNumber, String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public Message() {
        this.phoneNumber = null;
        this.message = null;
    }
}
