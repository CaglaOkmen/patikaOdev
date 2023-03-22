// ucak bileti fiyati hesaplama

import java.util.Scanner;
public class biletFiyat {
    public static void main(String[] args) {
        int mesafe, yas, biletTipi;
        double indirim = 0, tutar = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = inp.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = inp.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        biletTipi = inp.nextInt();

        if(yas > 0 && mesafe > 0 && (biletTipi == 1 || biletTipi == 2)){
            double normalTutar = mesafe * 0.10;
            System.out.println("Normal tutar =" + normalTutar);
            if(yas < 12){
                indirim = normalTutar * 0.50;
                tutar = normalTutar - indirim;
                System.out.println("Yas İndirimi =" + indirim);
            }
            else if(yas>=12 && yas<24){
                indirim = normalTutar * 0.10;
                tutar = normalTutar - indirim;
                System.out.println("Yas İndirimi =" + indirim);
            }
            else if(yas>65){
                indirim = normalTutar * 0.30;
                tutar = normalTutar - indirim;
                System.out.println("Yas İndirimi =" + indirim);
            }
            else{
                tutar = normalTutar;
            }
            if(biletTipi==2){
                double indirimli = tutar - (tutar * 0.2);
                double indirimliTutar = 2 * indirimli;
                System.out.println("Gidiş Dönüş Bilet İndirimi =" + indirimli);
                System.out.println("toplam tutar =" + indirimliTutar);
            }
            else{
                System.out.println("toplam tutar =" + tutar);
            }   
        }
        else{
            System.out.print("Hatalı Veri Girdiniz !");
        }
    }
}