// Manav Kasa programı
import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        double armut=2.14 , elma=3.67 , domates=1.11,Muz= 0.95,Patlıcan =5.00;
        int kilo;
        double toplam;
        
        Scanner girdi = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? : ");
        kilo = girdi.nextInt();
        toplam = kilo*armut;
        System.out.println("elma Kaç Kilo ? : ");
        kilo = girdi.nextInt();
        toplam += kilo*elma;
        System.out.println("domates Kaç Kilo ? : ");
        kilo = girdi.nextInt();
        toplam += kilo*domates;
        System.out.println("Muz Kaç Kilo ? : ");
        kilo = girdi.nextInt();
        toplam += kilo*Muz;
        System.out.println("Patlıcan Kaç Kilo ? : ");
        kilo = girdi.nextInt();
        toplam += kilo*Patlıcan;
        System.out.println("Toplam tutar: " + toplam);
    }
}
