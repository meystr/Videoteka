import java.util.ArrayList;

public class Film {
    private String tytul;
    private int rok;
    private int mojaOcena;
    private Osoba ktoWyporzyczyl;
    public RodzajFilmu rodzajFilmu ;

    public Film(String tytul, int rok, int mojaOcena, Osoba ktoWyporzyczyl, RodzajFilmu rodzajFilmu) {
        this.tytul = tytul;
        this.rok = rok;
        this.mojaOcena = mojaOcena;
        this.ktoWyporzyczyl = ktoWyporzyczyl;
        this.rodzajFilmu = rodzajFilmu;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getMojaOcena() {
        return mojaOcena;
    }

    public void setMojaOcena(int mojaOcena) {
        this.mojaOcena = mojaOcena;
    }

    public Osoba getKtoWyporzyczyl() {
        return ktoWyporzyczyl;
    }

    public void setKtoWyporzyczyl(Osoba ktoWyporzyczyl) {
        this.ktoWyporzyczyl = ktoWyporzyczyl;
    }

    public RodzajFilmu getRodzajFilmu() {
        return rodzajFilmu;
    }

    public void setRodzajFilmu(RodzajFilmu rodzajFilmu) {
        this.rodzajFilmu = rodzajFilmu;
    }

    @Override
    public String toString() {
        return "Film{" +
                "tytul='" + tytul + '\'' +
                ", rok=" + rok +
                ", mojaOcena=" + mojaOcena +
                ", ktoWyporzyczyl=" + ktoWyporzyczyl +
                ", rodzajFilmu=" + rodzajFilmu +
                '}';
    }
}
