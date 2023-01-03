import java.util.*;
import java.util.jar.JarEntry;

public class Main {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>(new PersonNameComparator());

        persons.add(new Person("Maria", 20));
        persons.add(new Student("Andrei", 19));
        persons.add(new Employed("Cristian", 32));
        persons.add(new Unemployed("Bogdan", 40));

        System.out.println(persons.size());
        persons.forEach(System.out::println);

        Set<Person> pers = new TreeSet<>(new PersonAgeComparator());

        pers.add(new Person("Maria", 20));
        pers.add(new Student("Andrei", 19));
        pers.add(new Employed("Cristian", 32));
        pers.add(new Unemployed("Bogdan", 40));

        System.out.println(pers.size());
        pers.forEach(System.out::println);


        ArrayList<Adress> adresa1 = new ArrayList<>();
        adresa1.add(new Adress(new Country("Romania"),"Brasov", "Fericirii", 20));
        adresa1.add(new Adress(new Country("Bulgaria"),"Basko", "Kaoluy", 239));
        adresa1.add(new Adress(new Country("Romania"),"Sinaia", "Florii", 56));

        ArrayList<Adress> adresa2 = new ArrayList<>();
        adresa2.add(new Adress(new Country("Franta"), "Paris", "Bordeaux", 341));
        adresa2.add(new Adress(new Country("Franta"), "Lyon", "Gateaux", 201));

        List<Hobby> hobbies1 = new ArrayList<>();
        hobbies1.add(new Hobby("sky",20, adresa1));
        hobbies1.add(new Hobby("ciclism", 10, adresa2));

        ArrayList<Adress> adresa3 = new ArrayList<>();
        adresa3.add(new Adress(new Country("Germania"), "Hamburg", "Alkew", 652));
        adresa3.add(new Adress(new Country("Spania"), "Madrid", "Mhtau", 23));

        ArrayList<Adress> adresa4 = new ArrayList<>();
        adresa4.add(new Adress(new Country("Egipt"), "Cairo", "Halfu", 45));
        adresa4.add(new Adress(new Country("Turcia"), "Istanbul", "Fayry", 100));
        adresa4.add(new Adress(new Country("Nigeria"), "Laos", "Jaloe", 98));

        List<Hobby> hobbies2 = new ArrayList<>();
        hobbies2.add(new Hobby("fotografie", 5, adresa3));
        hobbies2.add(new Hobby("voluntariat", 27, adresa4));

        HashMap<Person,List<Hobby>> people = new HashMap<Person,List<Hobby>>();
        people.put(new Person("Mihaela", 20),hobbies1);
        people.put(new Person("Catalin", 34),hobbies2);

        for (Map.Entry<Person,List<Hobby>> set : people.entrySet()) {
            System.out.println(set.getKey().getName() + " " + set.getValue().toString());
        }
    }
}