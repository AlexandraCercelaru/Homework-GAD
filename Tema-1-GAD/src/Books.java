public class Books implements Library {
    protected String Name;
    protected int NumberOfPages;

    public int getNumberOfPages() {
        return NumberOfPages;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Name='" + Name + '\'' + ", NumberOfPages=" + NumberOfPages + '}';
    }

    public void addBook(String name, int number) {
        this.Name = name;
        this.NumberOfPages = number;
    }

}
