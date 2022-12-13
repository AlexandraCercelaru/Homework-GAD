public class Contact {
    int index;
    String numberOfPhone;
    String FirstName;
    String LastName;

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setNumberOfPhone(String numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Contact{" + "index=" + index + ", numberOfPhone=" + numberOfPhone + ", FirstName='" + FirstName + '\'' + ", LastName='" + LastName + '\'' + '}';
    }

    public Contact(int index, String numberOfPhone, String FirstName, String LastName) {
        this.index = index;
        this.numberOfPhone = numberOfPhone;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public Contact() {
        this.index = 0;
        this.numberOfPhone = null;
        this.FirstName = null;
        this.LastName = null;
    }
}
