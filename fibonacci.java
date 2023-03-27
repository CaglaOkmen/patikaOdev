// girilen sayi kadar fibonacci sayilarini yazdırma
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int sayi, a = 0, b = 1,toplam;
        Scanner inp = new Scanner(System.in);

        System.out.print("sayi giriniz: ");
        sayi = inp.nextInt();

        for(int i =0; i<sayi; i++){
            System.out.print(a + " ");
            toplam = a + b;
            a = b;
            b = toplam;
        }
    }
}