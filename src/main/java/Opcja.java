import java.util.Scanner;

public class Opcja implements Akcja {

    private int identyfikator;
    private String trescKomunikatu;
    private Akcja akcja;

    public Opcja(int identyfikator, String trescKomunikatu, Akcja akcja) {
        this.identyfikator = identyfikator;
        this.trescKomunikatu = trescKomunikatu;
        this.akcja = akcja;
    }


    public int getIdentyfikator() {
        return identyfikator;
    }

    public void setIdentyfikator(int identyfikator) {
        this.identyfikator = identyfikator;
    }

    public String getTrescKomunikatu() {
        return trescKomunikatu;
    }

    public void setTrescKomunikatu(String trescKomunikatu) {
        this.trescKomunikatu = trescKomunikatu;
    }

    public Akcja getAkcja() {
        return akcja;
    }

    public void setAkcja(Akcja akcja) {
        this.akcja = akcja;
    }


    public void wykonajAkcje() {
        Scanner scanner = new Scanner(System.in);
        int wybor;
        wybor = scanner.nextInt();
    }

    @Override
    public String toString() {
        return identyfikator +
                ". " + trescKomunikatu;
    }
}