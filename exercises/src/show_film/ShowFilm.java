package show_film;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Function: Show film
 * <p>
 * Author: ShenJiaFa
 * Since: 2022/4/1-21:39
 */
public class ShowFilm {
    public static void main(String[] args) {

        // Create a collection and prefab data
        Collection<Film> films = new ArrayList<>();
        films.add(new Film("The Shaw Shank Redemption", 9.2, "Tim Robbins,Morgan Freeman"));
        films.add(new Film("The Godfather", 9.2, "Marlon Brando,Al Pacino"));
        films.add(new Film("The Dark Knight", 9.0, "Christian Bale,Heath Ledger"));

        // Start iterate
        films.forEach(film -> {
            System.out.println("Film name: " + film.getName());
            System.out.println("Film score: " + film.getScore());
            System.out.println("Film actor: " + film.getActor());
            System.out.println("--------------------------------------");
        });

    }
}
