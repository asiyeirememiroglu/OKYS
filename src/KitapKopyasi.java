public class KitapKopyasi {
    private String kopyaId;
    private Kitap kitap; 
    private boolean durum; 

    public KitapKopyasi(String kopyaId, Kitap kitap) {
        this.kopyaId = kopyaId;
        this.kitap = kitap;
        this.durum = true; 
    }

    public String getKopyaId() { return kopyaId; }
    public Kitap getKitap() { return kitap; }
    public boolean isDurum() { return durum; }
    public void setDurum(boolean durum) { this.durum = durum; }

    public void kopyaBilgisiGoster() {
        System.out.println("Kopya ID: " + kopyaId + " | Kitap: " + kitap.getKitapAdi() + " | Musait mi?: " + (durum ? "Evet" : "Hayir"));
    }
}