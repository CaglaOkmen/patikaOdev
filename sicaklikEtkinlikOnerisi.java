// hava sıcaklıgına göre etkinlik önerme

import java.util.Scanner;
public class sicaklikEtkinlikOnerisi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int hava;
        System.out.print("Sıcaklık Değerini Giriniz: ");
        hava = inp.nextInt();

        if (hava < 5){
            System.out.print("Kayak Yapabilirsin.");}

        else if (hava >= 5 && hava<=15) {
            System.out.print("Sinemaya Gidebilirsin");}

        else if (hava> 15 && hava<25){
            System.out.print("Pinkiğe Gidebilirsin");}

        else if (hava>=25){
            System.out.print("Yüzmeye Gidebilirsin");}
    }
}
