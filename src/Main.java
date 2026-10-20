public class Main {
    public static void main(String[] args) {
        Kitap kitap1 = new Kitap("975-07-1234-5", "Yabanci", "Albert Camus");
        KitapKopyasi kopya1 = new KitapKopyasi("KOPYA-01", kitap1);
        Kullanici uye1 = new Kullanici("USER-100", "Asiye irem Emiroglu", "irem@universite.edu.tr");

        uye1.bilgiGoster();
        kopya1.kopyaBilgisiGoster();

        System.out.println("\n--- Kitap odunc Alma islemi Yapiliyor ---\n");

        OduncKaydi odunc = new OduncKaydi("RCK-001", uye1, kopya1);
        odunc.oduncBilgileriniYazdir();

        System.out.println("\nislem Sonrasi Kopya Durumu:");
        kopya1.kopyaBilgisiGoster();
    }
}