package laskin;

import static java.lang.Math.sqrt;

public class Laskin {

    private double tulos;  // Muuttuja tulokselle, nyt double-tyyppinen

    public void nollaa() {
        tulos = 0.0;
    }

    public double annaTulos() {
        return tulos;
    }

    public void lisaa(double n) {
        tulos += n;
    }

    public void vahenna(double n) {
        tulos -= n;
    }

    public void kerro(double n) {
        tulos *= n;
    }

    public void jaa(double n) {
        if (n == 0) throw new ArithmeticException("Nollalla ei voi jakaa");
        tulos /= n;
    }

    public void nelio(double n) {
        tulos = n * n;
    }

    public void neliojuuri(double n) {
        if (n < 0) throw new ArithmeticException("Neliöjuurta ei voi laskea");
        tulos = sqrt(n);
    }

    public void virtaON() {
        // Tähän voisi laittaa alkutoimet
        tulos = 0.0;
    }

    public void virtaOFF() {
        // Tähän voisi laittaa lopputoimet
    }
}
