public class Kullanici {
    private String kullaniciId;
    private String adSoyad;
    private String eposta;

    public Kullanici(String kullaniciId, String adSoyad, String eposta) {
        this.kullaniciId = kullaniciId;
        this.adSoyad = adSoyad;
        this.eposta = eposta;
    }

    public String getKullaniciId() { return kullaniciId; }
    public String getAdSoyad() { return adSoyad; }
    public String getEposta() { return eposta; }

    public void bilgiGoster() {
        System.out.println("Kullanici: " + adSoyad + " (" + eposta + ")");
    }
}