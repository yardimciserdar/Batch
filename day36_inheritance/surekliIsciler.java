package day36_inheritance;

public class surekliIsciler extends Isci{
    @Override
    public String toString() {
        return "surekliIsciler{" +
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
        surekliIsciler surIc1=new surekliIsciler();
        surIc1.personelNo=5001;
        surIc1.isim="Cem";
        surIc1.soyisim="Akay";
        surIc1.statu="Isci";
        surIc1.saatucreti=11;
        surIc1.maas=surIc1.maasHesapla();
        System.out.println(surIc1);

    }

}
