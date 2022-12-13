import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Novel> novelsList = new ArrayList<>();
        List<ArtAlbum> artAlbumList = new ArrayList<>();
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        try {
            novelsList.add(new Novel("Moara cu noroc", 366, "bacalaureat"));
            novelsList.add(new Novel("Romanul adolescentului miop", 230, "adolescenti"));
            artAlbumList.add(new ArtAlbum("Arta1", 450, "55%"));
            artAlbumList.add(new ArtAlbum("Arta2", 180, "96%"));
        } catch (NullPointerException e) {
            System.out.println("Este null");
        }
        System.out.println("List of books for beginning: ");
        System.out.println(" ");
        for (i = 0; i < novelsList.size(); i++) {
            System.out.println(novelsList.get(i).toString());
        }
        for (i = 0; i < artAlbumList.size(); i++) {
            System.out.println(artAlbumList.get(i).toString());
        }
        System.out.println(" ");

        while (true) {
            System.out.println("Choose one digit: ");
            System.out.println("1-list books");
            System.out.println("2-add book");
            System.out.println("3-delete book");
            System.out.println("4-close the application");
            System.out.println(" ");

            int cifra = scanner.nextInt();
            String currline = scanner.nextLine();

            if (cifra == 1) {
                System.out.println("List of books: ");
                for (i = 0; i < novelsList.size(); i++) {
                    System.out.println(novelsList.get(i).toString());
                }
                for (i = 0; i < artAlbumList.size(); i++) {
                    System.out.println(artAlbumList.get(i).toString());
                }
                System.out.println(" ");
            } else if (cifra == 2) {
                System.out.println("It is Novel or ArtAlbum? ");
                currline = scanner.nextLine();
                if (currline.equals("Novel")) {
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Number of pages: ");
                    int nop = scanner.nextInt();
                    currline = scanner.nextLine();
                    System.out.println("Type: ");
                    String tip = scanner.nextLine();
                    novelsList.add(new Novel(name, nop, tip));
                } else if (currline.equals("ArtAlbum")) {
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Number of pages: ");
                    int nop = scanner.nextInt();
                    currline = scanner.nextLine();
                    System.out.println("Paper quality: ");
                    String qa = scanner.nextLine();
                    artAlbumList.add(new ArtAlbum(name, nop, qa));
                } else {
                    System.out.println("Sorry! We do not have this section here. Please enter one from above.");
                }
            } else if (cifra == 3) {
                System.out.println("It is Novel or ArtAlbum? ");
                currline = scanner.nextLine();
                if (currline.equals("Novel")) {
                    System.out.println("What is the name of the book? ");
                    currline = scanner.nextLine();
                    for (i = 0; i < novelsList.size(); i++) {
                        if (novelsList.get(i).getName().equals(currline)) {
                            novelsList.remove(i);
                        } else {
                            System.out.println("Sorry. This book is not in our library!");
                        }
                    }
                } else if (currline.equals("ArtAlbum")) {
                    System.out.println("What is the name of the book? ");
                    currline = scanner.nextLine();
                    for (i = 0; i < artAlbumList.size(); i++) {
                        if (artAlbumList.get(i).getName().equals(currline)) {
                            artAlbumList.remove(i);
                        } else {
                            System.out.println("Sorry. This book is not in our library!");
                        }
                    }
                } else {
                    System.out.println("Sorry! We do not have this section here. Please enter one from above.");
                }
            } else if (cifra == 4) {
                break;
            } else {
                System.out.println("Nu exista aceasta optiune. Incercati din nou");
            }
        }

    }
}
