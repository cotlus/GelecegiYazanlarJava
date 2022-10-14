public class Agac {
    private final boolean igneYaprak = true;
    private String latinceAd;
    private boolean isikAgaci;
    private int ortalamaBoy;

    public Agac(String latinceAd, boolean isikAgaci, boolean agaci, int ortalamaBoy) {
        this.latinceAd = latinceAd;
        this.isikAgaci = isikAgaci;
        this.ortalamaBoy = ortalamaBoy;
    }

    public boolean isIgneYaprak() {
        return igneYaprak;
    }

    public String getLatinceAd() {
        return latinceAd;
    }

    public void setLatinceAd(String latinceAd) {
        this.latinceAd = latinceAd;
    }

    public boolean isIsikAgaci() {
        return isikAgaci;
    }

    public void setIsikAgaci(boolean isikAgaci) {
        this.isikAgaci = isikAgaci;
    }

    public int getOrtalamaBoy() {
        return ortalamaBoy;
    }

    public void setOrtalamaBoy(int ortalamaBoy) {
        this.ortalamaBoy = ortalamaBoy;
    }

    public void YagmurYagdi() {
        System.out.println("Yağmur yağdı. Ağacınızın su ihtiyacı karşılandı.");
    }

    public void KurakOl() {
        System.out.println("Kuraklık oldu. Ağacınız kurudu.");
    }
}
