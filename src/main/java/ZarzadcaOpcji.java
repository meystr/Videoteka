import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ZarzadcaOpcji {

    public List<Opcja> listaOpcji = new ArrayList<Opcja>();


    public void dodajOpcje(Opcja opcja) {
        listaOpcji.add(opcja);
    }

    public void wyswietlOpcje() {
        for (int i = 0; i < listaOpcji.size(); i++) {
            System.out.println(listaOpcji.get(i));
        }
    }


    @Override
    public String toString() {
        return "ZarzadcaOpcji{" +
                "listaOpcji=" + listaOpcji +
                '}';
    }

    public void wykonajopcje(int idOpcji) throws IOException {

        for (int i = 0; i < listaOpcji.size(); i++) {
            Opcja opcja = listaOpcji.get(i);
            if (opcja.getIdentyfikator() == idOpcji) {
                opcja.getAkcja().wykonajAkcje();
                break;
            }
        }
    }
}
