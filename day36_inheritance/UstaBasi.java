package day36_inheritance;

public class UstaBasi extends Isci{
    @Override
    public String toString() {
        return "UstaBasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatucreti=" + saatucreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", personelNo=" + personelNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        UstaBasi ustabasi1=new UstaBasi();
        ustabasi1.saatucreti=15;
        ustabasi1.isim="Murat";
        ustabasi1.soyisim="Gokcek";
        ustabasi1.maas= ustabasi1.maasHesapla();
        ustabasi1.statu="Isci";
        ustabasi1.isciStatu="Ustabası";
        System.out.println(ustabasi1);
    }
}
