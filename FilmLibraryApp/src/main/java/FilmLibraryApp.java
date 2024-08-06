import java.util.Scanner;

public class FilmLibraryApp {
    public static void main(String[] args) {
        Movie movie1 = new Movie(1000, "The Shawshank Redemption", "Frank Darabont", 1994, "Drama", 9.3);
        Movie movie2 = new Movie(1001, "The Godfather", "Francis Ford Coppola", 1972, "Crime", 9.2);
        Movie movie3 = new Movie(1002, "The Dark Knight", "Christopher Nolan", 2008, "Action", 9.0);

        FilmLibrary library = new FilmLibrary();
        library.add(movie1);
        library.add(movie2);
        library.add(movie3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("-".repeat(34));
        System.out.println("Film Kutuphanesi Yonetim Sistemi");
        System.out.println("-".repeat(34));

        boolean dongu = true;
        while (dongu) {
            System.out.println();
            System.out.println("1. Film Ekle");
            System.out.println("2. Film Sil");
            System.out.println("3. Film Rating Guncelle");
            System.out.println("4. Tum Filmleri Listele");
            System.out.println("5. Ture Gore Filmleri Listele");
            System.out.println("6. Verilen Dereceden Buyuk Filmleri Listele");
            System.out.println("7. Cikis");
            System.out.println();
            System.out.print("Seciminizi yapiniz: ");
            int secim = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            System.out.println("-".repeat(34));
            switch (secim) {
                case 1:
                    System.out.println("Film id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Film adi: ");
                    String name = scanner.nextLine();
                    System.out.println("Film yonetmeni: ");
                    String director = scanner.nextLine();
                    System.out.println("Film cikis yili: ");
                    int releaseYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Film turu: ");
                    String genre = scanner.nextLine();
                    System.out.println("Film derecesi: ");
                    double rating = scanner.nextDouble();
                    Movie movie = new Movie(id, name, director, releaseYear, genre, rating);
                    library.add(movie);
                    System.out.println("Film basariyla eklendi");
                    break;
                case 2:
                    System.out.println("Silmek istediginiz film id'sini giriniz: ");
                    int deleteId = scanner.nextInt();
                    library.delete(deleteId);
                    break;
                case 3:
                    System.out.println("Lutfen guncellemek istediginiz film idsini giriniz ");
                    int updateId = scanner.nextInt();
                    System.out.println("Lutfen rating giriniz: ");
                    double updateRating = scanner.nextDouble();
                    library.updateRating(updateId, updateRating);
                    break;
                case 4:
                    library.showAll();
                    break;
                case 5:
                    System.out.println("Lutfen turu giriniz");
                    String showGenre = scanner.nextLine();
                    library.showFilmByGenre(showGenre);
                    break;
                case 6:
                    System.out.println("Lutfen rating giriniz");
                    double showRating = scanner.nextDouble();
                    library.showFilmByRating(showRating);
                    break;
                case 7:
                    System.out.println("Cikis yapiliyor...");
                    dongu = false;
                    break;
                default:
                    System.out.println("Gecersiz secim, tekrar deneyin");
                    break;
            }

        }

    }
}
