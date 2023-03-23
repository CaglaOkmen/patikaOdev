// 3 ve 4 e bölünen sayıların ortalaması

import java.util.Scanner;
public class bolunenSayilarinOrt {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi, toplam = 0, count = 0;
        
        System.out.print("Sayi giriniz: ");
        sayi = inp.nextInt();

        for(int i=1 ; i<=sayi ; i++){
            if(i % 3 == 0 && i % 4 == 0){
                toplam += i;
                count++;
            }
        }
        double sonuc = toplam / count;
        System.out.print("12 ye bolunen sayiların ortalamasi: " + sonuc);
    }
}
