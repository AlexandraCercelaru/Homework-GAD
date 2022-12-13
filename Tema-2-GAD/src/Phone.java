public interface Phone {
    public void addContact(Contact C);

    public void listContacts();

    public void sendMessage(Message M);

    public void seeMessage(String numberOfPhone);

    public void makeCall(Call c);

    public void viewHistory();
}
