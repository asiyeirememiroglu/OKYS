public class Kitap {
    private String ISBN;
    private String kitapAdi;
    private String yazar;

    public Kitap(String ISBN, String kitapAdi, String yazar) {
        this.ISBN = ISBN;
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
    }

    public String getISBN() { return ISBN; }
    public String getKitapAdi() { return kitapAdi; }
    public String getYazar() { return yazar; }

    public void kitapBilgisiVer() {
        System.out.println("Kitap: " + kitapAdi + " - Yazar: " + yazar + " (ISBN: " + ISBN + ")");
    }
}