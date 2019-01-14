import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Film> listaFilmow = new ArrayList<Film>();
        final Videoteka videoteka = new Videoteka(listaFilmow);

        Scanner scanner = new Scanner(System.in);
        Osoba janKowalski = new Osoba("Jan", "Kowalski");
        Film film = new Film("AAa", 1999, 5, janKowalski, RodzajFilmu.KOMEDIA);
        listaFilmow.add(film);

        Opcja opcja1 = new Opcja(1, "Wyświetl filmy", () -> videoteka.wyswietlFilmy());
        Opcja opcja2 = new Opcja(2, "Dodaj film", () -> videoteka.dodajFilm());
        Opcja opcja3 = new Opcja(3, "Oceń film", () -> videoteka.ocenFilm());
        Opcja opcja4 = new Opcja(4, "Wypożycz film", () -> videoteka.wypozyczFilm());
        Opcja opcja5 = new Opcja(5, "Zwtor filmu", () -> videoteka.zwrotFilmu());
        Opcja opcja6 = new Opcja(6, "Usuń film", () -> videoteka.usunFilm());
        Opcja opcja7 = new Opcja(7, "Wyeksportuj listę (JSON)",eksportListy());
        Opcja opcja8 = new Opcja(8, "Importuj listę (JSON)", importListy());
        Opcja opcja9 = new Opcja(9, "Wyjście", () -> videoteka.wyjscie());

        ZarzadcaOpcji zarzadcaOpcji = new ZarzadcaOpcji();
        zarzadcaOpcji.dodajOpcje(opcja1);
        zarzadcaOpcji.dodajOpcje(opcja2);
        zarzadcaOpcji.dodajOpcje(opcja3);
        zarzadcaOpcji.dodajOpcje(opcja4);
        zarzadcaOpcji.dodajOpcje(opcja5);
        zarzadcaOpcji.dodajOpcje(opcja6);
        zarzadcaOpcji.dodajOpcje(opcja7);
        zarzadcaOpcji.dodajOpcje(opcja8);
        zarzadcaOpcji.dodajOpcje(opcja9);

        // pobrac od uzytkownika int - id
        int id;
        do {
            zarzadcaOpcji.wyswietlOpcje();
            id = scanner.nextInt();
            switch (id) {
                default:
                    zarzadcaOpcji.wykonajopcje(id);
            }
        }while (true);
    }

    private static Akcja importListy() {
        return null;
    }

    private static Akcja eksportListy() throws IOException {
        FileWriter file = new FileWriter("C:\\Users\\Public\\lista.json");
        Gson gson = new Gson();
        Main main = new Main();
        String s = gson.toJson(main);
        file.write(s);
        return null;
    }
}
