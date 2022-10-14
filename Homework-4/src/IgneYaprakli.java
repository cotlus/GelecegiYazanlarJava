public class IgneYaprakli extends Agac {
    private final int cap;
    private final String cag;


    public IgneYaprakli(String latinceAd, boolean igneYaprak, boolean isikAgaci, int ortalamaBoy, int cap, String cag) {

        super(latinceAd, igneYaprak, isikAgaci, ortalamaBoy);
        this.cap = cap;
        this.cag = cag;
    }


    public void agacBilgi() {
        String isikDurumu;
        if (isIsikAgaci()) {
            isikDurumu = "Işık ağacı";
        } else {
            isikDurumu = "Gölge ağacı";
        }

        String yaprak;
        if (isIgneYaprak()) {
            yaprak = "İğne yapraklı";
        } else {
            yaprak = "Geniş yapraklı";
        }

        System.out.println("Ağacınız İğne yapraklı (" + getLatinceAd() + ") " + cap + "cm çapında ve " + cag + " çağında. Ortalama boyu " + getOrtalamaBoy() + " metre, " + isikDurumu + ", " + yaprak + ".");
    }
}
