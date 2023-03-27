import java.util.Scanner;
public class minMaxBulma {
    public static void main(String[] args) {
        int sayi, giris, min, max;

        Scanner inp =new Scanner(System.in);
        System.out.print("kaç sayi gireceksiniz: ");
        sayi = inp.nextInt();
        System.out.print(  "1.sayiyi giriniz: ");
        giris = inp.nextInt();
        min = giris;
        max = giris;
        for(int i =2; i<=sayi;i++){
            System.out.print(i + ".sayiyi giriniz: ");
            giris = inp.nextInt();
            if(giris<min){
                min = giris;
            }
            if(giris>max){
                max = giris;
            }
        }
        System.out.print("min: " + min + "\nmax: " + max);
    }
}
