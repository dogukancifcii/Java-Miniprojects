public interface Repo<T> {

    void add(T t);

    void delete(int id);

    void updateRating(int id, double rating);

    void showAll();
}

