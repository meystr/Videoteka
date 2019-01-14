import com.google.gson.Gson;

import java.util.List;

public class Videoteka {

    List<Film> listaFilmow;

    public Videoteka(List<Film> listaFilmow) {
        this.listaFilmow = listaFilmow;
    }

    public void wyswietlFilmy() {
        for (Film film : listaFilmow) {
            System.out.println(film);
        }
    }

    public void dodajFilm() {

    }

    public void ocenFilm() {

    }

    public void wypozyczFilm() {

    }

    public void zwrotFilmu() {

    }

    public void usunFilm() {


    }

    public void wyjscie() {
        System.exit(0);
    }
}
