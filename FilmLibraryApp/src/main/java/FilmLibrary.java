import java.util.ArrayList;

public class FilmLibrary implements Repo<Movie> {

    ArrayList<Movie> library = new ArrayList<>();

    @Override
    public void add(Movie movie) {
        library.add(movie);
    }

    @Override
    public void delete(int id) {
        boolean getIt = false;
        for (Movie w : library) {
            if (w.getId() == id) {
                library.remove(w);
                getIt = true;
                break;
            }
        }
        if (!getIt) {
            System.out.println("Film silinemedi id kontrol ediniz");
        }

    }

    @Override
    public void updateRating(int id, double rating) {
        boolean getIt = false;
        for (Movie w : library) {
            if (w.getId() == id) {
                w.setRating(rating);
                getIt = true;
                System.out.println("Rating guncellendi");
                break;
            }
        }
        if (!getIt) {
            System.out.println("Film guncellenemedi id kontrol ediniz");
        }
    }

    @Override
    public void showAll() {
        System.out.printf("%-5s | %-30s | %-20s | %-4s | %-10s | %s%n",
                "ID", "Başlık", "Yönetmen", "Yıl", "Tür", "Derece");
        System.out.println("------|--------------------------------|----------------------|------|------------|------");
        for (Movie w : library) {
            System.out.println(w);
        }
    }

    public void showFilmByGenre(String genre) {
        boolean getIt = false;
        for (Movie w : library) {
            if (w.getGenre().equals(genre)) {
                System.out.println(w);
                getIt = true;
            }

        }
        if (!getIt) {
            System.out.println("Film bulunamadi turu kontrol ediniz");
        }
    }

    public void showFilmByRating(double rating) {
        boolean getIt = false;
        for (Movie w : library) {
            if (w.getRating() >= rating) {
                System.out.println(w);
                getIt = true;
            }

        }
        if (!getIt) {
            System.out.println("Film bulunamadi");
        }
    }
}