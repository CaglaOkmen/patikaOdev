import java.util.Scanner;

public class sayiyaEnYakınDegerler {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = inp.nextInt();
        
        int birKucukDeger = Integer.MIN_VALUE;
        int birBuyukDeger = Integer.MAX_VALUE;
        
        for (int i = 0; i < list.length; i++) {
            if (list[i] < sayi && list[i] > birKucukDeger) {
                birKucukDeger = list[i];
            }
            if (list[i] > sayi && list[i] < birBuyukDeger) {
                birBuyukDeger = list[i];
            }
        }
        if (birKucukDeger != Integer.MIN_VALUE) {
            System.out.println("Girilen sayıya en yakın bir küçük değer: " + birKucukDeger);
        } else {
            System.out.println("Girilen sayıya en yakın bir küçük değer yoktur.");
        }

        if (birBuyukDeger != Integer.MAX_VALUE) {
            System.out.println("Girilen sayıya en yakın bir büyük değer: " + birBuyukDeger);
        } else {
            System.out.println("Girilen sayıya en yakın bir büyük değer yoktur.");
        } 
    }
}