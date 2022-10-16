public class Yonetici extends Calisan {
    private int sorumlu_kisi_sayisi;

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster();
        System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayısı: " + sorumlu_kisi_sayisi);
    }

    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;

    }
    public void zamYap(int zamMiktari){
        System.out.println(getAd() + " çalışanlara " + zamMiktari + " kadar zam yapılıyor");
    }
}
