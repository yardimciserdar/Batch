package day36_inheritance;

public class Memur extends Muhasebe{
    @Override
    public String toString() {
        return "Memur{" +
                "saatucreti=" + saatucreti +
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

        Memur memur1=new Memur();
        // memur1 objesi Memur class ' ının objesi olmasına rağmen
        // inherit ettiği Muhasebe ve onun da Parent'i olan Personel
        //class içindeki tüm dataları alabilir.


        // Personel class'indan
        memur1.personelNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="3127186723";


        //Muhasebe class' ından
        memur1.saatucreti=10;
        memur1.maas=memur1.maasHesapla();
        memur1.statu="Memur";

        System.out.println(memur1);




        Memur memur2=new Memur();
        memur2.personelNo=1002;
        memur2.saatucreti=10;
        memur2.maas= memur2.maasHesapla();

        System.out.println(memur2);
    }
}
