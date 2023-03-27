//mükemmel sayi 
import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String[] args) {
        int sayi, toplam=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("sayi giriniz: ");
        sayi = inp.nextInt();

        for(int i=1; i<sayi; i++){
            if(sayi%i==0){
                toplam += i;
            }
        }
        if(sayi==toplam){
            System.out.print("mukemmel sayidir");
        }
        else{
            System.out.print("mukemmel sayi degildir");
        }
    }
}
