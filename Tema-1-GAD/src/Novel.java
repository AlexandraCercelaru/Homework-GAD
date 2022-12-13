public class Novel extends Books {
    private String Type;

    public String getName() {
        return super.getName();
    }

    public int getNumberOfPages() {
        return super.getNumberOfPages();
    }

    public String getType() {
        return this.Type;
    }

    @Override
    public String toString() {
        return ("Novel{" + super.toString() + ", Type='" + Type + '\'' + '}');
    }

    public Novel(String name, int number, String tip) {
        super.addBook(name, number);
        this.Type = tip;
    }
}
