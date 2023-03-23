// 4 ve 5 in kuvvetlerini girilen sayiya kadar yazdirma

import java.util.Scanner;
public class dortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int sayi;

        Scanner inp = new Scanner(System.in);
        System.out.print("sayi giriniz: ");
        sayi = inp.nextInt();
        System.out.print("4'un kuvvetleri: ");
        for(int i = 1; i <= sayi; i *= 4){
            System.out.print(i + " ");
        }

        System.out.print("\n5'un kuvvetleri: ");
        for(int i = 1; i <= sayi; i *= 5){
            System.out.print(i + " ");
        }
    }
}
