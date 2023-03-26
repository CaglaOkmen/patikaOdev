// girilen sayinin harmonik sayi serisini bulma
import java.util.Scanner;
public class harmonikSayi {
    public static void main(String[] args) {
        double toplam = 0.0;

        Scanner inp = new Scanner(System.in);
        System.out.print("sayi giriniz: ");
        int a = inp.nextInt();

        for(double i = 1; i <= a;i++){
            toplam += (1/i);
        }
        System.out.print("harmonik sonucu: " + toplam);
    }
}
