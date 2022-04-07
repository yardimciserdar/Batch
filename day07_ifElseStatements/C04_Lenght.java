package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_Lenght {
    public static void main(String[] args) {
        // kullanıcdan asimini alıp baş harini ve son harfini büyük yazrıdırın.


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
                String isim =scan.nextLine();
        System.out.println("ilk harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));


    }
}
