import java.time.LocalDate;

public class OduncKaydi {
    private String kayitId;
    private Kullanici kullanici; 
    private KitapKopyasi kitapKopyasi; 
    private LocalDate oduncTarihi;
    private LocalDate iadeTarihi;

    public OduncKaydi(String kayitId, Kullanici kullanici, KitapKopyasi kitapKopyasi) {
        this.kayitId = kayitId;
        this.kullanici = kullanici;
        this.kitapKopyasi = kitapKopyasi;
        this.oduncTarihi = LocalDate.now();
        this.iadeTarihi = this.oduncTarihi.plusDays(15); 
        
        kitapKopyasi.setDurum(false);
    }

    public void oduncBilgileriniYazdir() {
        System.out.println("--- odunc Kaydi ---");
        System.out.println("Kayit ID: " + kayitId);
        System.out.println("Alan Kullanici: " + kullanici.getAdSoyad());
        System.out.println("Verilen Kitap: " + kitapKopyasi.getKitap().getKitapAdi() + " (Kopya ID: " + kitapKopyasi.getKopyaId() + ")");
        System.out.println("odunc Tarihi: " + oduncTarihi);
        System.out.println("Son iade Tarihi: " + iadeTarihi);
    }
}