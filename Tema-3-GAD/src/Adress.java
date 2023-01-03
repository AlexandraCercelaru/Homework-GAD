public class Adress {

    Country country;
    String city;
    String street;
    int number;

    public Adress(Country country, String city, String street, int number) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return " " + country;
    }
}
